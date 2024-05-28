import java.util.List;

public class Notificare {
    public void trimiteNotificare(List<IObserver> observers, String message) {
        for (IObserver observer : observers) {
            observer.update(message);
        }
    }
}
