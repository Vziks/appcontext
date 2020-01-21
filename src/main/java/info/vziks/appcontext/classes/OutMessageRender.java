package info.vziks.appcontext.classes;

import info.vziks.appcontext.interfaces.MessageProvider;
import info.vziks.appcontext.interfaces.MessageRender;

/**
 * Class OutMessageRender
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class OutMessageRender implements MessageRender {

    MessageProvider messageProvider;
    @Override
    public void render() {

        if (null == messageProvider) {
          throw new RuntimeException("Need set property messageProvider of class " +  OutMessageRender.class.getName());
        }
        System.out.println(messageProvider.getMessage());

    }

    @Override
    public void setMessageRender(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageRender() {
        return  this.messageProvider;
    }
}
