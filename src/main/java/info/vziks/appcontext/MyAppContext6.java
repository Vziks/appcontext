package info.vziks.appcontext;

import info.vziks.appcontext.classes.Address;
import info.vziks.appcontext.interfaces.MessageRender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class MyAppContext6
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class MyAppContext6 {
    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext contextTry =
                     new ClassPathXmlApplicationContext("myAppContext.xml")

        ) {
            MessageRender outMessageRender = contextTry.getBean("render", MessageRender.class);
            outMessageRender.render();
        }
    }
}
