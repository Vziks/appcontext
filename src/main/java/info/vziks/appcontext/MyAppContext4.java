package info.vziks.appcontext;

import info.vziks.appcontext.classes.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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
