public class Netflix implements VideoPlayer{
    @Override
    public void Pause() {
        System.out.println("Are you still watching?");
    }

    @Override
    public void Play() {
        System.out.println("Playing Netflix");
    }

    @Override
    public void Skip() {
        System.out.println("Skip to the good part");
    }
}
