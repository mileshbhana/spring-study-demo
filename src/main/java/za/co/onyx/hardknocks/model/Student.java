package za.co.onyx.hardknocks.model;

import java.util.Date;

/**
 * Created by milez on 2017/11/01.
 */
public class Student {

    private String studentId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    public Student() {
    }

    public Student(String studentId, String firstName, String lastName, Date dateOfBirth) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
}
