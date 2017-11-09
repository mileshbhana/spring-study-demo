package za.co.onyx.hardknocks.data.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;


/**
 * Created by milez on 2017/11/01.
 */
@Configuration
public class EmbeddedDbConfig {

    @Bean(name = "dataSource")
    @Profile("local")
    public DataSource dataSourceEmbedded(){
        return
                (new EmbeddedDatabaseBuilder())
                        .setType(EmbeddedDatabaseType.H2)
                        .addScript("classpath:sql/schema.sql")
                        .addScript("classpath:sql/data.sql")
                        .build();
    }


}
