package info.vziks.appcontext.classes;

import info.vziks.appcontext.interfaces.MessageProvider;

/**
 * Class HelloMessageProvider
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class HelloMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello";
    }
}
