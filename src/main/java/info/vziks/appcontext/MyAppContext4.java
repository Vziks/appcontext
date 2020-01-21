package info.vziks.appcontext;

import info.vziks.appcontext.beans.ClassicMusic;
import info.vziks.appcontext.beans.PopMusic;
import info.vziks.appcontext.beans.RockMusic;
import info.vziks.appcontext.classes.Config;
import info.vziks.appcontext.classes.MusicPlayer;
import info.vziks.appcontext.interfaces.Music;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * Class MyAppContext4
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class MyAppContext4 {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext contextTry =
                     new ClassPathXmlApplicationContext("myAppContext.xml")

        ) {
//            MusicPlayer musicPlayer = (MusicPlayer)contextTry.getBean("musicPlayer");
            MusicPlayer musicPlayerSet = contextTry.getBean("musicPlayerSet", MusicPlayer.class);
            System.out.println(musicPlayerSet.playSong());

            MusicPlayer musicPlayer = contextTry.getBean("musicPlayer", MusicPlayer.class);
            System.out.println(musicPlayer.playSong());

            MusicPlayer musicPlayerList = contextTry.getBean("musicPlayerList", MusicPlayer.class);
            musicPlayerList.playMusicList();

        }
    }

}
