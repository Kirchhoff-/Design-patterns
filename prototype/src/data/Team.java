package data;

public abstract class Team extends Prototype {

    @Override
    public abstract Team copy() throws CloneNotSupportedException;

}
