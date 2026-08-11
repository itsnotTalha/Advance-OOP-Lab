public class YouTube implements VideoPlayer{
    @Override
    public void Pause() {
        System.out.println("YT video is paused");
    }

    @Override
    public void Play() {
        System.out.println("Playing YT video");
    }

    @Override
    public void Skip() {
        System.out.println("Skipped to the next");
    }
}
