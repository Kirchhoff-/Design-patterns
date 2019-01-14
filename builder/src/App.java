public class App {

    public static void main(String[] args) {
        FootballTeam chelsea = new FootballTeam.Builder("London", "Chelsea")
                .coach("Sarri")
                .president("Abramovich")
                .tournamentPosition(10)
                .build();
        System.out.println(chelsea);

        FootballTeam milan = new FootballTeam.Builder("Milan", "Ac Milan")
                .tournamentPosition(1)
                .build();
        System.out.println(milan);

        FootballTeam randomTeam = new FootballTeam.Builder("Random city", "QWERT")
                .build();
        System.out.println(randomTeam);
    }
}
