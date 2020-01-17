package info.vziks.appcontext;

import info.vziks.appcontext.beans.MyBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class MyAppContext1
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class MyAppContext1 {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("myAppContext.xml")) {
            MyBean testBean = context.getBean("myBean", MyBean.class);
            System.out.println(testBean.getName());
        }
    }
}
