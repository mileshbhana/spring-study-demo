package za.co.onyx.hardknocks.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import za.co.onyx.hardknocks.data.config.AppDbConfig;
import za.co.onyx.hardknocks.data.config.EmbeddedDbConfig;
import za.co.onyx.hardknocks.model.CampusRegion;

/**
 * Created by milez on 2017/11/01.
 */
@Configuration
@ComponentScan(basePackages = {"za.co.onyx.hardknocks"})
@PropertySource("classpath:/config/application.properties")
@Import(value = {AppDbConfig.class, EmbeddedDbConfig.class})
public class AppConfig {

/*    @Bean
    public static PropertySourcesPlaceholderConfigurer pspc() {
        return new PropertySourcesPlaceholderConfigurer();
    }*/

    @Bean
    public MyEnvironment myEnvironment() {
        return new MyEnvironment();
    }

}
