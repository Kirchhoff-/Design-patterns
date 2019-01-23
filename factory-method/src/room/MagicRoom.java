package room;

public final class MagicRoom extends Room {

    @Override
    public void connect(Room room) {
        System.out.println("Connect MagicRoom");
    }

    @Override
    public String toString() {
        return "Magic Room";
    }
}
