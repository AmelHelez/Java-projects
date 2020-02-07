package ba.edu.ssst;

import java.util.ArrayList;

public class Team {
    private int numOfPlayers;
    private Manager manager;
    private ArrayList<Player> players;

    public Team(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
        manager = new Manager("","",0);
        players = new ArrayList<>();
    }

    public void addPlayer(Player p) {
            players.add(p);
            this.numOfPlayers--;
            if(this.numOfPlayers == -1) {
                throw new IllegalArgumentException("The collection is full!");
            }
        }


    public void addManager(Manager m) {
        manager = m;
    }

    public void print() {
        for (Player p: players) {
            System.out.println(p);
        }
        System.out.println(manager);
    }



}
