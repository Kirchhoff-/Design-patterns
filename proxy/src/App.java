public final class App {

    public static void main(String[] args) {
        QueueProxy proxy = new QueueProxy(new QueueImpl());
        proxy.addItem(new Item("First Item"));
        proxy.addItem(new Item(null));
        proxy.addItem(new Item("Second Item"));
        proxy.addItem(new Item(null));
        proxy.addItem(new Item("Third Item"));
        System.out.println("Queue size = " + proxy.size());
    }

}
