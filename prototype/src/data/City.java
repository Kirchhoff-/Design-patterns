package data;

public abstract class City extends Prototype {

    @Override
    public abstract City copy() throws CloneNotSupportedException;

}
