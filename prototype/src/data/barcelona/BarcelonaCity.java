package data.barcelona;

import data.City;

public final class BarcelonaCity extends City {

    private final String additionalInfo;

    public BarcelonaCity(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    private BarcelonaCity(BarcelonaCity city) {
        this.additionalInfo = city.additionalInfo;
    }

    @Override
    public BarcelonaCity copy() {
        return new BarcelonaCity(this);
    }

    @Override
    public String toString() {
        return "Barcelona city, additional info = " + additionalInfo;
    }
}
