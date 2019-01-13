package factory;

import data.City;
import data.Coach;
import data.Team;

public interface FootballTeamFactory {

    Team createTeam();

    Coach createCoach();

    City createCity();

}
