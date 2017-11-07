package za.co.onyx.hardknocks.data.repository.jdbc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.co.onyx.hardknocks.config.AppConfig;
import za.co.onyx.hardknocks.model.Student;

/**
 * Created by milez on 2017/11/01.
 */
public class JdbcStudentRepositoryTest {

    JdbcStudentRepository studentRepository;

    @Before
    public void setup() {
        System.setProperty("spring.profiles.active", "local");
        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        studentRepository = context.getBean(JdbcStudentRepository.class);

    }

    @Test
    public void testFindOne() {
        Student student = studentRepository.findOne("BHA001");

        Assert.assertNotNull(student);

    }

}
