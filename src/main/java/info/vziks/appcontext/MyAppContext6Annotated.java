package info.vziks.appcontext;

import info.vziks.appcontext.classes.HelloConfig;
import info.vziks.appcontext.interfaces.MessageRender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Class MyAppContext6Annotated
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class MyAppContext6Annotated {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloConfig.class);
        MessageRender render = applicationContext.getBean("render", MessageRender.class);
        render.render();
    }
}
