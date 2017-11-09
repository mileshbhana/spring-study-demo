package za.co.onyx.hardknocks.data.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * DB Configuration to Oracle DB
 * Created by milez on 2017/11/06.
 */
@Configuration
@PropertySource("classpath:/config/infrastructure-${ENV}.properties")
public class AppDbConfig {

    @Autowired
    public Environment env;

    @Bean(name = "dataSource")
    @Profile("dev")
    public DataSource dataSourceDev(@Value("${db.driver}") String dbDriver,@Value("${db.url}") String dbUrl

    ) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dbDriver);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(env.getProperty("db.user"));
        dataSource.setPassword(env.getProperty("db.password"));
        return dataSource;
    }
}
