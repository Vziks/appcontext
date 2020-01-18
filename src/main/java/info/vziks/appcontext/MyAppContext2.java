package info.vziks.appcontext;

import info.vziks.appcontext.beans.ClassicMusic;
import info.vziks.appcontext.beans.PopMusic;
import info.vziks.appcontext.beans.RockMusic;
import info.vziks.appcontext.classes.Company;
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
            musics.add(contextTry.getBean("RockMusic", RockMusic.class));
            musics.add(contextTry.getBean("ClassicMusic", ClassicMusic.class));


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
            musics.add((Music) context.getBean("popMusic"));
            musics.add(context.getBean("popMusic", PopMusic.class));

            for (Music music : musics) {
                MusicPlayer musicPlayer = new MusicPlayer(music);
                System.out.println(musicPlayer.playSong());
            }
        }
    }
}
