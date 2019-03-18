import java.util.ArrayList;
import java.util.List;

final class Subject {

    private List<Observer> observers;
    private int state;

    Subject() {
        observers = new ArrayList<>();
    }

    int state() {
        return state;
    }

    void state(int state) {
        this.state = state;
    }

    void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
