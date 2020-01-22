package info.vziks.appcontext;

import info.vziks.appcontext.classes.Address;
import info.vziks.appcontext.classes.ScopeConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Class MyAppContext7
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class MyAppContext7 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
        Address address1 = applicationContext.getBean("singleton", Address.class);
        Address address2 = applicationContext.getBean("singleton", Address.class);
        System.out.println("address1 hashCode: " + address1.hashCode());
        System.out.println("address2 hashCode: " + address2.hashCode());


        System.out.println("address1 getStreet: " + address1.getStreet());
        System.out.println("address2 getStreet: " + address2.getStreet());

        address1.setStreet("New Street");

        System.out.println("address1 getStreet: " + address1.getStreet());
        System.out.println("address2 getStreet: " + address2.getStreet());

        Address address3 = applicationContext.getBean("prototype", Address.class);
        Address address4 = applicationContext.getBean("prototype", Address.class);

        System.out.println("address3 hashCode: " + address3.hashCode());
        System.out.println("address4 hashCode: " + address4.hashCode());


        System.out.println("address3 getStreet: " + address3.getStreet());
        System.out.println("address4 getStreet: " + address4.getStreet());

        address4.setStreet("New Street");

        System.out.println("address3 getStreet: " + address3.getStreet());
        System.out.println("address4 getStreet: " + address4.getStreet());


    }
}
