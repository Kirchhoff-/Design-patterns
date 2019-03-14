final class Memento {

    private final String state;

    Memento(String state) {
        this.state = state;
    }

    String state() {
        return state;
    }

}
