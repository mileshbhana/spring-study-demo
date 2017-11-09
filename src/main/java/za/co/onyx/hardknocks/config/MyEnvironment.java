package za.co.onyx.hardknocks.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.StandardEnvironment;

/**
 * Created by milez on 2017/11/09.
 */
public class MyEnvironment {
    @Value("#{ systemProperties }")
    private java.util.Properties systemProperties;

    @Value("#{ systemEnvironment }")
    private java.util.Properties systemEnvironment;

    @Value("#{ environment}")
    private StandardEnvironment environment;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SYSTEM_PROPERTIES************************************\n");
        sb.append(systemProperties).append("\n");
        sb.append("******************************************************\n\n");

        sb.append("SYSTEM_ENVIRONMENT************************************\n");
        sb.append(systemEnvironment).append("\n");
        sb.append("******************************************************\n\n");

        sb.append("ENVIRONMENT************************************\n");
        sb.append(environment).append("\n");
        sb.append("******************************************************\n\n");

        return sb.toString();
    }
}
