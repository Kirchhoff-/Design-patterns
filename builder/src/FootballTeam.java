import com.sun.istack.internal.NotNull;

public final class FootballTeam {

    private final String name;
    private final String city;
    private final String coach;
    private final String president;
    private final int tournamentPosition;

    private FootballTeam(Builder builder) {
        this.name = builder.name;
        this.city = builder.city;
        this.coach = builder.coach;
        this.president = builder.president;
        this.tournamentPosition = builder.tournamentPosition;
    }

    @Override
    public String toString() {
        return String.format("Name = %s, City = %s, Coach = %s, President = %s, Tournament position = %d",
                name, city, coach, president, tournamentPosition);
    }

    @SuppressWarnings("SameParameterValue")
    static class Builder {

        static String DEFAULT_COACH = "NONE";
        static String DEFAULT_PRESIDENT = "NONE";
        static int DEFAULT_TOURNAMENT_POSITION = 0;
        private final String name;
        private final String city;
        private String coach;
        private String president;
        private int tournamentPosition;

        Builder(@NotNull String city, @NotNull String name) {
            this.city = city;
            this.name = name;
            this.coach = DEFAULT_COACH;
            this.president = DEFAULT_PRESIDENT;
            this.tournamentPosition = DEFAULT_TOURNAMENT_POSITION;
        }

        Builder coach(@NotNull String coach) {
            this.coach = coach;
            return this;
        }

        Builder president(@NotNull String president) {
            this.president = president;
            return this;
        }

        Builder tournamentPosition(int tournamentPosition) {
            this.tournamentPosition = tournamentPosition;
            return this;
        }

        FootballTeam build() {
            return new FootballTeam(this);
        }
    }
}
