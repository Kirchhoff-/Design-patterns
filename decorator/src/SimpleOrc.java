public final class SimpleOrc implements Orc {

    @Override
    public void attack() {
        System.out.println("Orc attack you");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public int getHealth() {
        return 50;
    }

}
