package data.real;

import data.Team;

public final class RealTeam extends Team {

    private final String additionalInfo;

    public RealTeam(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    private RealTeam(RealTeam team) {
        this.additionalInfo = team.additionalInfo;
    }

    @Override
    public RealTeam copy() {
        return new RealTeam(this);
    }

    @Override
    public String toString() {
        return "Real team, additional info = " + additionalInfo;
    }
}
