
final class BAR implements Element {

    public void accept(Visitor v) {
        v.visit(this);
    }

    String getBAR() {
        return "BAR";
    }

}
