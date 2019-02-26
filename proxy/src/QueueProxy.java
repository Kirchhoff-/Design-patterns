public final class QueueProxy implements Queue {

    private final Queue queue;

    QueueProxy(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void addItem(Item item) {
        if (item.getName() != null) {
            System.out.println("Added new item");
            queue.addItem(item);
        } else {
            System.out.println("Can't added item with null name to queue");
        }
    }

    @Override
    public int size() {
        return queue.size();
    }

}
