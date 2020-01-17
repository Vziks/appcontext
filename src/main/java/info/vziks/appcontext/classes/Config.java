package info.vziks.appcontext.classes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Class Config
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class Config {
    @Bean()
    public Address getAddress() {
        return new Address("High Street", 1000);
    }
}