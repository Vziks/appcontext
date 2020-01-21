package info.vziks.appcontext.classes;

import info.vziks.appcontext.interfaces.Music;

import java.util.ArrayList;
import java.util.List;

/**
 * Class MusicPlayer
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class MusicPlayer {

    private List<Music> playList = new ArrayList<>();
    private Music music;


    private int volume;


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

    public void setMusicList(List<Music> musicList) {
        this.playList = musicList;
    }


    public void playMusicList() {
        for(Music music : playList) {
            System.out.println("Playing: " + music.play());
        }
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer setVolume(int volume) {
        this.volume = volume;
        return this;
    }
}
