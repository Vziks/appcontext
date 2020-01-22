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
 * Class MyAppContext2
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class MyAppContext2 {


    public static void main(String[] args) {

        ArrayList<Music> musics = new ArrayList<>();

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        try (ClassPathXmlApplicationContext contextTry =
                     new ClassPathXmlApplicationContext("myAppContext.xml")

        ) {
            musics.add(contextTry.getBean("rockMusic", RockMusic.class));
            musics.add(contextTry.getBean("classicMusic", ClassicMusic.class));


            String[] allBeanNames1 = context.getBeanDefinitionNames();
            String[] allBeanNames2 = contextTry.getBeanDefinitionNames();

            System.out.println();

            for (String bean:
                    allBeanNames1) {
                System.out.println(bean);
            }

            System.out.println();

            for (String bean:
                    allBeanNames2) {
                System.out.println(bean);
            }
            System.out.println();

            musics.add(context.getBean(PopMusic.class));
            musics.add((Music) context.getBean("popMusicConfig"));
            musics.add(context.getBean("popMusicConfig", PopMusic.class));

            for (Music music : musics) {
                MusicPlayer musicPlayer = new MusicPlayer(music);
                System.out.println(musicPlayer.playSong());
            }
        }
    }
}
