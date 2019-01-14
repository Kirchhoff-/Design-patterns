package data;

public abstract class Coach extends Prototype {

    @Override
    public abstract Coach copy() throws CloneNotSupportedException;

}
