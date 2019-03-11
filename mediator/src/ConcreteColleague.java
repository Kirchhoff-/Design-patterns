public final class ConcreteColleague extends Colleague {

    ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague Received: " + message);
    }

}
