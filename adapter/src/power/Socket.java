package power;

import data.Volt;

public class Socket implements PowerSupply {

    @Override
    public Volt voltage() {
        return new Volt(220);
    }

}
