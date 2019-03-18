final class HexaObserver extends Observer {

    HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.state()).toUpperCase());
    }

}
