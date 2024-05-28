import java.util.ArrayList;
import java.util.List;

public class Oferte {
    private List<IObserver> observers = new ArrayList<>();

    public void adaugaObservator(IObserver observer) {
        observers.add(observer);
    }

    public void stergeObservator(IObserver observer) {
        observers.remove(observer);
    }

    public void NotificaObservator(String message) {
        for (IObserver observer : observers) {
            observer.update(message);
        }
    }

    public List<IObserver> getObservers() {
        return observers;
    }
}
