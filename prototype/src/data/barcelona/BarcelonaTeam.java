package data.barcelona;

import data.Team;

public final class BarcelonaTeam extends Team {

    private final String additionalInfo;

    public BarcelonaTeam(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    private BarcelonaTeam(BarcelonaTeam team) {
        this.additionalInfo = team.additionalInfo;
    }

    @Override
    public BarcelonaTeam copy() {
        return new BarcelonaTeam(this);
    }

    @Override
    public String toString() {
        return "Barcelona team, additional info = " + additionalInfo;
    }
}
