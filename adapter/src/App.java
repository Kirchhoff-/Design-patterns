import adapter.SocketAdapter;
import adapter.SocketClassAdapterImpl;
import adapter.SocketObjectAdapterImpl;
import data.Volt;
import power.Socket;

public class App {

    public static void main(String[] args) {

        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        printVoltage("SocketClassAdapter", socketAdapter.transformTo3Volt());
        printVoltage("SocketClassAdapter", socketAdapter.transformTo12Volt());
        printVoltage("SocketClassAdapter", socketAdapter.transformTo120Volt());
        socketAdapter = new SocketObjectAdapterImpl(new Socket());
        printVoltage("SocketObjectAdapter", socketAdapter.transformTo3Volt());
        printVoltage("SocketObjectAdapter", socketAdapter.transformTo12Volt());
        printVoltage("SocketObjectAdapter", socketAdapter.transformTo120Volt());
    }

    private static void printVoltage(String source, Volt volt) {
        System.out.println(String.format("Get voltage %d from %s", volt.volts(), source));
    }
}
