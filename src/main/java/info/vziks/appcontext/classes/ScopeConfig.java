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

//    @Bean(initMethod = "initIt", destroyMethod = "destroyIt")
    @Bean()

    /* Xml
    <bean id="init"
          class="info.vziks.appcontext.classes.Address"
          init-method="initIt" destroy-method="destroyIt">
        <constructor-arg name="street" value="Street"/>
        <constructor-arg name="number" value="50"/>
    </bean>
     */
    public Address init() {
        System.out.println("Create Bean");
        return new Address("Street", 1000);
    }

}
