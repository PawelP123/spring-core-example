package pl.sda.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.sda.players.MkvPlayer;
import pl.sda.players.Mp3Player;
import pl.sda.players.Mp4Player;
import pl.sda.players.Player;
import pl.sda.seller.PlayerSeller;

@Configuration
public class PlayerConfiguration {

    @Bean
    Mp3Player mp3Player() {
        return new Mp3Player();
    }

    @Bean
    Mp4Player mp4Player() {
        return new Mp4Player();
    }

    @Bean
    MkvPlayer mkvPlayer() {
        return new MkvPlayer();
    }

//    @Bean
//    PlayerSeller mp3Player(Player mp3Player) {
//        return new PlayerSeller(mp3Player);
//    }
//
//
//    @Bean
//    PlayerSeller mp4Player(Player mp4Player) {
//        return new PlayerSeller(mp4Player);
//    }
//
//
//    @Bean
//    PlayerSeller mkvPlayer(Player mkvPlayer) {
//        return new PlayerSeller(mkvPlayer);
//    }
}
