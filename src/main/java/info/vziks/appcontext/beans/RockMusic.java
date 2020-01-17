package info.vziks.appcontext.beans;

import info.vziks.appcontext.interfaces.Music;

/**
 * Class RockMusic
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class RockMusic implements Music {
    @Override
    public String play() {
        return "RockMusic";
    }
}
