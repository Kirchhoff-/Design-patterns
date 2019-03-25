public final class App {

    public static void main(String[] args) {
        Orc orc = new Orc(new AxeAttackMethod("human1"));
        orc.attack();
        orc.changeAttackMethod(new SwordAttackMethod("human2"));
        orc.attack();
    }

}
