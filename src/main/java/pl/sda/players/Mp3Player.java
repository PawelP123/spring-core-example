package pl.sda.players;

public class Mp3Player implements Player {
    @Override
    public void play() {
        System.out.println(Mp3Player.class.getSimpleName());
    }
}
