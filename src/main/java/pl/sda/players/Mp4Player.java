package pl.sda.players;

public class Mp4Player implements Player {
    @Override
    public void play() {
        System.out.println(Mp4Player.class.getSimpleName());
    }
}
