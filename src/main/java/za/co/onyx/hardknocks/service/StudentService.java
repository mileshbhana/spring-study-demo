package za.co.onyx.hardknocks.service;

import za.co.onyx.hardknocks.model.Student;

import java.util.List;

/**
 * Created by milez on 2017/11/07.
 */
public interface StudentService {

    Student findById(String studentId);

    List<Student> findByLastName(String lastName);

    void registerForCourse(String studentId, String courseId);




}
