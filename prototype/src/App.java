import data.City;
import data.Coach;
import data.Team;
import data.barcelona.BarcelonaCity;
import data.barcelona.BarcelonaCoach;
import data.barcelona.BarcelonaTeam;
import data.real.RealCity;
import data.real.RealCoach;
import data.real.RealTeam;
import factory.FootballTeamFactory;
import factory.FootballTeamFactoryImpl;

public class App {

    public static void main(String[] args) {
        FootballTeamFactory factory;
        City city;
        Coach coach;
        Team team;

        factory = new FootballTeamFactoryImpl(new RealCity("ReadCity additional info"),
                new RealCoach("RealCoach additional info"), new RealTeam("RealTeam additional info"));
        city = factory.createCity();
        coach = factory.createCoach();
        team = factory.createTeam();
        printInfo(city);
        printInfo(coach);
        printInfo(team);

        factory = new FootballTeamFactoryImpl(new BarcelonaCity("BarcelonaCity additional info"),
                new BarcelonaCoach("BarcelonaCoach additional info"), new BarcelonaTeam("BarcelonaTeam additional info"));
        city = factory.createCity();
        coach = factory.createCoach();
        team = factory.createTeam();
        printInfo(city);
        printInfo(coach);
        printInfo(team);
    }

    private static void printInfo(Object object) {
        System.out.println(object);
    }
}
