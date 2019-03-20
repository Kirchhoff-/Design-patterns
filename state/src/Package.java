final class Package {

    private PackageState state;

    Package() {
        state = new OrderedState();
    }

    void state(PackageState state) {
        this.state = state;
    }

    public PackageState state() {
        return this.state;
    }

    public void previousState() {
        state.prev(this);
    }

    void nextState() {
        state.next(this);
    }

    void printStatus() {
        state.printStatus();
    }

}
