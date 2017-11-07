package za.co.onyx.hardknocks.model;

/**
 * Created by milez on 2017/11/01.
 */
public class Course {

    private String courseId;
    private String courseDescription;
    private Integer courseLevel;

    public Course(String courseId, String courseDescription, Integer courseLevel) {
        this.courseId = courseId;
        this.courseDescription = courseDescription;
        this.courseLevel = courseLevel;
    }

    public Course() {
    }

    public String getCourseId() {
        return courseId;
    }

    public Course setCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public Course setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
        return this;
    }

    public Integer getCourseLevel() {
        return courseLevel;
    }

    public Course setCourseLevel(Integer courseLevel) {
        this.courseLevel = courseLevel;
        return this;
    }
}
