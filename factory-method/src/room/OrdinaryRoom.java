package room;

public final class OrdinaryRoom extends Room {

    @Override
    public void connect(Room room) {
        System.out.println("Connect OrdinaryRoom");
    }

    @Override
    public String toString() {
        return "Ordinary Room";
    }
}
