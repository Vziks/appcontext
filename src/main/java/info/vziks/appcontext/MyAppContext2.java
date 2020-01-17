package info.vziks.appcontext;

import info.vziks.appcontext.beans.ClassicMusic;
import info.vziks.appcontext.beans.RockMusic;
import info.vziks.appcontext.classes.MusicPlayer;
import info.vziks.appcontext.interfaces.Music;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * Class MyAppContext2
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class MyAppContext2 {


    public static void main(String[] args) {

        ArrayList<Music> musics = new ArrayList<>();

        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("myAppContext.xml")) {
            musics.add(context.getBean("RockMusic", RockMusic.class));
            musics.add(context.getBean("ClassicMusic", ClassicMusic.class));

            for (Music music : musics) {
                MusicPlayer musicPlayer = new MusicPlayer(music);
                System.out.println(musicPlayer.playSong());
            }
        }
    }
}
