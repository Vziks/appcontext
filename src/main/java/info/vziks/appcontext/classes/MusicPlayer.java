package info.vziks.appcontext.classes;

import info.vziks.appcontext.interfaces.Music;

/**
 * Class MusicPlayer
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public String playSong() {
        return this.music.play();
    }

    public MusicPlayer setMusic(Music music) {
        this.music = music;
        return this;
    }
}
