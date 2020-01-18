package info.vziks.appcontext.beans;

import info.vziks.appcontext.interfaces.Music;

/**
 * Class PopMusic
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class PopMusic implements Music {
    @Override
    public String play() {
        return "PopMusic";
    }
}
