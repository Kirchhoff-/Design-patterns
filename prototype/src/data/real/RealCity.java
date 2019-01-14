package data.real;

import data.City;

public final class RealCity extends City {

    private final String additionalInfo;

    public RealCity(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    private RealCity(RealCity city) {
        this.additionalInfo = city.additionalInfo;
    }

    @Override
    public RealCity copy() {
        return new RealCity(this);
    }

    @Override
    public String toString() {
        return "Real city, additional info = " + additionalInfo;
    }
}
