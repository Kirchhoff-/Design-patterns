import device.Device;
import device.Radio;
import device.Tv;
import remote.AdvancedRemote;
import remote.BasicRemote;

public class App {

    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new Tv());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
