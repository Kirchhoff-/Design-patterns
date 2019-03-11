public final class MobileColleague extends Colleague {

    MobileColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Mobile Received: " + message);
    }

}
