package info.vziks.appcontext.beans;

import info.vziks.appcontext.interfaces.Music;

/**
 * Class ClassicMusic
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class ClassicMusic implements Music {
    @Override
    public String play() {
        return "ClassicMusic";
    }
}
