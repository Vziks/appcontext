package info.vziks.appcontext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class MyAppContext
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class MyAppContext {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "myAppContext.xml"
        )) {
            MyBean testBean = context.getBean("myBean", MyBean.class);
            System.out.println(testBean.getName());
        }
    }
}
