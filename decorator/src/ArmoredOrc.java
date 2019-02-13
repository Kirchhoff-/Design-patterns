public final class ArmoredOrc implements Orc {

    private Orc decorated;

    public ArmoredOrc(Orc decorated) {
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        decorated.attack();
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower();
    }

    @Override
    public int getHealth() {
        return decorated.getHealth() + 10;
    }

}
