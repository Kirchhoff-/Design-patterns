final class ReceivedState implements PackageState {

    @Override
    public void next(Package pkg) {
        System.out.println("This package is already received by a client.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.state(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Received.");
    }

}
