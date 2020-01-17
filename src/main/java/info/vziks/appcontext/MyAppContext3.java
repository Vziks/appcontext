package info.vziks.appcontext;

import info.vziks.appcontext.classes.Company;
import info.vziks.appcontext.classes.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Class MyAppContext3
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class MyAppContext3 {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Company company = context.getBean("company", Company.class);

        System.out.println(company.getAddress().getStreet());
        System.out.println(company.getAddress().getNumber());
    }
}
