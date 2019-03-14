final class Originator {

    private String state;

    void setState(String state) {
        this.state = state;
    }

    String state() {
        return state;
    }

    Memento saveStateToMemento() {
        return new Memento(state);
    }

    void getStateFromMemento(Memento memento) {
        state = memento.state();
    }

}
