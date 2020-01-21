package info.vziks.appcontext;

import info.vziks.appcontext.classes.MusicPlayer;
import info.vziks.appcontext.classes.PropertyContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class MyAppContext5
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class MyAppContext5 {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext contextTry =
                     new ClassPathXmlApplicationContext("myAppContext.xml")

        ) {
            PropertyContext propertyContext1 = contextTry.getBean("propertyContext1", PropertyContext.class);
            System.out.println(propertyContext1.getName());
            System.out.println(propertyContext1.getNumber());


            PropertyContext propertyContext2 = contextTry.getBean("propertyContext2", PropertyContext.class);
            System.out.println(propertyContext2.getName());
            System.out.println(propertyContext2.getNumber());


            PropertyContext propertyContext3 = contextTry.getBean("propertyContext3", PropertyContext.class);
            System.out.println(propertyContext3.getName());
            System.out.println(propertyContext3.getNumber());
        }
    }

}
