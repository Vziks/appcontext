package info.vziks.appcontext.interfaces;

/**
 * Interface MessageRender
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public interface MessageRender {
    void render();
    void setMessageRender(MessageProvider messageProvider);
    MessageProvider getMessageRender();
}
