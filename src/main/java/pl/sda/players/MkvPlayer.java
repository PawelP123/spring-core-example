package pl.sda.players;

public class MkvPlayer implements Player {
    @Override
    public void play() {
        System.out.println(MkvPlayer.class.getSimpleName());
    }
}
