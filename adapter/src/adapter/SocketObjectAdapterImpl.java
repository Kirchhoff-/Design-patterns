package adapter;


import data.Volt;
import power.Socket;

public final class SocketObjectAdapterImpl implements SocketAdapter {

    private final Socket socket;

    public SocketObjectAdapterImpl(Socket socket) {
        this.socket = socket;
    }

    @Override
    public Volt transformTo120Volt() {
        return new Volt(socket.voltage().volts() / 2);
    }

    @Override
    public Volt transformTo12Volt() {
        return new Volt(socket.voltage().volts() / 18);
    }

    @Override
    public Volt transformTo3Volt() {
        return new Volt(socket.voltage().volts() / 73);
    }
}
