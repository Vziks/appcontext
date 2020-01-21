package info.vziks.appcontext.classes;

import info.vziks.appcontext.interfaces.MessageProvider;
import info.vziks.appcontext.interfaces.MessageRender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Class HelloConfig
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
@Configuration
public class HelloConfig {
    @Bean
    public MessageProvider provider() {
        return new HelloMessageProvider();
    }

    @Bean
    public MessageRender render() {
        OutMessageRender render = new OutMessageRender();
        render.setMessageRender(provider());
        return render;
    }
}
