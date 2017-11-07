package za.co.onyx.hardknocks.data.repository.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import za.co.onyx.hardknocks.data.repository.StudentRepository;
import za.co.onyx.hardknocks.model.Student;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by milez on 2017/11/06.
 */
@Repository
public class JdbcStudentRepository implements StudentRepository {

    @Autowired
    private DataSource dataSource;

    @Override
    public Student findOne(String studentId) {
        String query = "Select * from hard_knocks.student where student_id = ?";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        Object[] args = { studentId };

        Student student = jdbcTemplate.queryForObject(query, args, new RowMapper<Student>() {
                    @Override
                    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                        return
                                new Student(
                                        resultSet.getString("student_id"),
                                        resultSet.getString("first_name"),
                                        resultSet.getString("last_name"),
                                        resultSet.getDate("date_of_birth"));
                    }
                });

        return student;
    }


    @Override
    public List<Student> findByLastName(String lastName) {
        return null;
    }
}
