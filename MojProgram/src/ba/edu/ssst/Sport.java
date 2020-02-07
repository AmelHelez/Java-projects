package ba.edu.ssst;

public abstract class Sport {
    private final String name;
    private final int numberOfPlayers;

    public Sport(String name, int numberOfPlayers) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void bestTeam(void best) {
        this.best = best;
    }
}
