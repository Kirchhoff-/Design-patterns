public final class AxeAttackMethod extends AttackMethod {

    private final String target;

    public AxeAttackMethod(String target) {
        this.target = target;
    }

    @Override
    protected String pickTarget() {
        return target;
    }

    @Override
    protected void firstAttack(String target) {
        System.out.println(String.format("First attack %s with axe", target));
    }

    @Override
    protected void secondAttack(String target) {
        System.out.println(String.format("Second attack %s with axe", target));
    }

}
