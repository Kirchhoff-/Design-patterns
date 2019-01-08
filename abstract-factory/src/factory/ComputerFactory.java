package factory;

import data.Computer;

public final class ComputerFactory {

    public Computer createComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }

}
