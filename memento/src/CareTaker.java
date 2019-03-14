import java.util.ArrayList;
import java.util.List;

final class CareTaker {

    private final List<Memento> mementoList;

    CareTaker() {
        mementoList = new ArrayList<>();
    }

    void add(Memento state) {
        mementoList.add(state);
    }

    Memento get(int index) {
        return mementoList.get(index);
    }

}
