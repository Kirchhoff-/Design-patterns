public class App {

    public static void main(String[] args) {
        Orc orc = new SimpleOrc();
        printOrcInfo(orc);
        Orc armoredOrc = new ArmoredOrc(orc);
        printOrcInfo(armoredOrc);
        Orc armedOrc = new ArmedOrc(orc);
        printOrcInfo(armedOrc);
    }

    private static void printOrcInfo(Orc orc) {
        System.out.println(orc.getClass().getSimpleName());
        System.out.println("Health = " + orc.getHealth());
        System.out.println("Attack power = " + orc.getAttackPower());
        orc.attack();
        System.out.println("----------------");
    }
}
