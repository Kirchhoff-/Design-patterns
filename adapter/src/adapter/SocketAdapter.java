package adapter;

import data.Volt;

public interface SocketAdapter {

    Volt transformTo120Volt();

    Volt transformTo12Volt();

    Volt transformTo3Volt();
}
