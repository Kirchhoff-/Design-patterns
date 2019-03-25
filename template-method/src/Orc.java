public final class Orc {

    private AttackMethod attackMethod;

    public Orc(AttackMethod attackMethod) {
        this.attackMethod = attackMethod;
    }

    public void attack() {
        attackMethod.attack();
    }

    public void changeAttackMethod(AttackMethod attackMethod) {
        this.attackMethod = attackMethod;
    }

}
