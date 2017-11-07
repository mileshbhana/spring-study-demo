package za.co.onyx.hardknocks.service;

import org.springframework.stereotype.Component;
import za.co.onyx.hardknocks.model.Student;

import java.util.List;

/**
 * Created by milez on 2017/11/07.
 */
@Component
public class StudentServiceImpl implements StudentService {

    @Override
    public Student findById(String studentId) {
        return null;
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        return null;
    }

    @Override
    public void registerForCourse(String studentId, String courseId) {

    }
}
