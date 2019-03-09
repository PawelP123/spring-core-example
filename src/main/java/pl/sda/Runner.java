package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.configuration.PlayerConfiguration;
import pl.sda.configuration.SellerConfiguration;
import pl.sda.players.MkvPlayer;
import pl.sda.players.Mp3Player;
import pl.sda.players.Mp4Player;
import pl.sda.seller.PlayerSeller;

public class Runner {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//
//        context.getBean("mp3Seller", PlayerSeller.class).sell();
//        context.getBean("mp4Seller", PlayerSeller.class).sell();
//        context.getBean("mkvSeller", PlayerSeller.class).sell();
        ApplicationContext context = new AnnotationConfigApplicationContext(PlayerConfiguration.class);
        context.getBean("mp3Player", Mp3Player.class).play();
        ApplicationContext context2 = new AnnotationConfigApplicationContext(SellerConfiguration.class);
        context2.getBean("playerSeller",PlayerSeller.class).sell();


    }
}
