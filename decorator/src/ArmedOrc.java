public final class ArmedOrc implements Orc {

    private final Orc decorated;

    public ArmedOrc(Orc decorated) {
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        decorated.attack();
        System.out.println(" with the axe");
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower() + 10;
    }

    @Override
    public int getHealth() {
        return decorated.getHealth();
    }

}
