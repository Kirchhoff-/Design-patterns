public abstract class Colleague {

    private Mediator mediator;

    Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    void send(String message) {
        mediator.send(message, this);
    }

    public abstract void receive(String message);

}
