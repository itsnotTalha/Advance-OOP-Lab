import java.sql.SQLOutput;

public class spotify implements AudioPlayer{
    @Override
    public void pause_Music() {
        System.out.println("Pausing your track");
    }

    @Override
    public void play_Music() {
        System.out.println("Playing your track");

    }
}
