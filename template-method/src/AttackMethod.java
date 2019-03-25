public abstract class AttackMethod {

    protected abstract String pickTarget();

    protected abstract void firstAttack(String target);

    protected abstract void secondAttack(String target);

    public void attack() {
        String target = pickTarget();
        System.out.println("Will attack target = " + target);
        firstAttack(target);
        secondAttack(target);
    }

}
