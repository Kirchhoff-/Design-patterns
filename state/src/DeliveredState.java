final class DeliveredState implements PackageState {

    @Override
    public void next(Package pkg) {
        pkg.state(new ReceivedState());
    }

    @Override
    public void prev(Package pkg) {
        pkg.state(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }

}
