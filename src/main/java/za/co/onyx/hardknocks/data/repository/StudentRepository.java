package za.co.onyx.hardknocks.data.repository;

import za.co.onyx.hardknocks.model.Student;

import java.util.List;

/**
 * Created by milez on 2017/11/01.
 */
public interface StudentRepository {

    Student findOne(String studentId);

    List<Student> findByLastName(String lastName);

}
