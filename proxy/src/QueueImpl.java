import java.util.ArrayList;
import java.util.List;

public final class QueueImpl implements Queue {

    private final List<Item> items;

    QueueImpl() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public int size() {
        return items.size();
    }

}
