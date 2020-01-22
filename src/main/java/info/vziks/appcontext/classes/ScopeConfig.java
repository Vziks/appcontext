package info.vziks.appcontext.classes;

import info.vziks.appcontext.interfaces.MessageProvider;
import info.vziks.appcontext.interfaces.MessageRender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Class ScopeConfig
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
@Configuration
public class ScopeConfig {

    @Bean
    public Address singleton() {
        return new Address("Street", 1000);
    }

    @Bean()
    @Scope("prototype")
    public Address prototype() {
        return new Address("Street", 1000);
    }
}
