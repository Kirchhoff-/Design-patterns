import java.util.ArrayList;

public final class ChatMediator implements Mediator {

    private final ArrayList<Colleague> colleagues;

    ChatMediator() {
        colleagues = new ArrayList<>();
    }

    void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void send(String message, Colleague originator) {
        for (Colleague colleague : colleagues) {
            if (colleague != originator) {
                colleague.receive(message);
            }
        }
    }

}
