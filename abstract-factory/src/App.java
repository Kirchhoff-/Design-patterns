import data.Computer;
import factory.ComputerFactory;
import factory.PCFactory;
import factory.ServerFactory;


public class App {

    public static void main(String[] args) {
        Computer pc = new ComputerFactory().createComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = new ComputerFactory().createComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}
