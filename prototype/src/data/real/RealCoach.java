package data.real;

import data.Coach;

public final class RealCoach extends Coach {

    private final String additionalInfo;

    public RealCoach(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    private RealCoach(RealCoach realCoach) {
        this.additionalInfo = realCoach.additionalInfo;
    }

    @Override
    public RealCoach copy() {
        return new RealCoach(this);
    }

    @Override
    public String toString() {
        return "Real coach, additional info = " + additionalInfo;
    }
}
