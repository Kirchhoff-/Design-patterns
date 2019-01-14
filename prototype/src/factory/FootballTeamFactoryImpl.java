package factory;

import data.City;
import data.Coach;
import data.Team;

public final class FootballTeamFactoryImpl implements FootballTeamFactory {

    private City city;
    private Coach coach;
    private Team team;

    public FootballTeamFactoryImpl(City city, Coach coach, Team team) {
        this.city = city;
        this.coach = coach;
        this.team = team;
    }

    @Override
    public Team createTeam() {
        Team resultTeam;
        try {
            resultTeam = team.copy();
        } catch (CloneNotSupportedException e) {
            resultTeam = null;
        }

        return resultTeam;
    }

    @Override
    public Coach createCoach() {
        Coach resultCoach;
        try {
            resultCoach = coach.copy();
        } catch (CloneNotSupportedException e) {
            resultCoach = null;
        }

        return resultCoach;
    }

    @Override
    public City createCity() {
        City resultCity;
        try {
            resultCity = city.copy();
        } catch (CloneNotSupportedException e) {
            resultCity = null;
        }

        return resultCity;
    }

}
