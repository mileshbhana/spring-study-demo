package za.co.onyx.hardknocks.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.co.onyx.hardknocks.data.config.AppDbConfig;
import za.co.onyx.hardknocks.data.config.EmbeddedDbConfig;

/**
 * Created by milez on 2017/11/01.
 */
@Configuration
@ComponentScan(basePackages = {"za.co.onyx.hardknocks"})
@Import(value = {AppDbConfig.class, EmbeddedDbConfig.class})
public class AppConfig {


}
