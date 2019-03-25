public final class SwordAttackMethod extends AttackMethod {

    private final String target;

    public SwordAttackMethod(String target) {
        this.target = target;
    }

    @Override
    protected String pickTarget() {
        return target;
    }

    @Override
    protected void firstAttack(String target) {
        System.out.println(String.format("First attack %s with sword", target));
    }

    @Override
    protected void secondAttack(String target) {
        System.out.println(String.format("Second attack %s with sword", target));
    }

}
