package data.barcelona;

import data.Coach;

public final class BarcelonaCoach extends Coach {

    private final String additionalInfo;

    public BarcelonaCoach(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    private BarcelonaCoach(BarcelonaCoach coach) {
        this.additionalInfo = coach.additionalInfo;
    }

    @Override
    public BarcelonaCoach copy() {
        return new BarcelonaCoach(this);
    }

    @Override
    public String toString() {
        return "Barcelona coach, additional info = " + additionalInfo;
    }
}
