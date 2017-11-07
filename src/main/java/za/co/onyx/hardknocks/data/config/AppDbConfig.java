package za.co.onyx.hardknocks.data.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * DB Configuration to Oracle DB
 * Created by milez on 2017/11/06.
 */
@Configuration
public class AppDbConfig {

    @Bean(name = "dataSource")
    @Profile("dev")
    public DataSource dataSourceDev() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        dataSource.setUsername("hard_knocks");
        dataSource.setPassword("hardknocks");
        return dataSource;
    }
}
