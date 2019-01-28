package adapter;

import data.Volt;
import power.Socket;

public final class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt transformTo120Volt() {
        return convertVolt(voltage(), 2);
    }

    @Override
    public Volt transformTo12Volt() {
        return convertVolt(voltage(), 18);
    }

    @Override
    public Volt transformTo3Volt() {
        return convertVolt(voltage(), 73);
    }

    private Volt convertVolt(Volt volt, int reduceSize) {
        return new Volt(volt.volts() / reduceSize);
    }
}
