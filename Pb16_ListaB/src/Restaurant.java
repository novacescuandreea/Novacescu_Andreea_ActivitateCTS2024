public class Restaurant implements IObserver {
    @Override
    public void update(String message) {
        System.out.println("Notificare manager: " + message);
    }
}