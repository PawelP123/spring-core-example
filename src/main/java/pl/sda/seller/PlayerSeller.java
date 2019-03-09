package pl.sda.seller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.sda.players.Player;

@Component
public class PlayerSeller {
    private final Player player;

    public PlayerSeller(@Qualifier("mp3Player") Player player) {
        this.player = player;
    }

    public void sell() {
        player.play();
    }
}
