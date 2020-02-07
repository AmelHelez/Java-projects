package team.Sport;

import java.util.ArrayList;
public class Team {
    private int num_of_players;
    private Manager manager;
    private ArrayList<Player> players;
    private String team_name;

    public Team(int num_of_players) {
        this.num_of_players = num_of_players;
        this.manager = new Manager("","",0);
        this.players = new ArrayList<>();
    }
    public Team(int num_of_players,Manager manager) {
        this.num_of_players = num_of_players;
        this.manager = manager;
        this.players = new ArrayList<>();
    }
    public Team(int num_of_players, Manager manager, ArrayList<Player> players) {
        this.players = players;
        this.manager = manager;
        this.num_of_players = num_of_players;
    }
    public void addPlayer(Player player) {
        this.players.add(player);
    }
    public void addManager(Manager manager) {
        this.manager = manager;
    }
    public void printTeam() {
        System.out.print("Players in this team are: ");
        for(Player player: this.players)
        {
            System.out.println(player);
        }
        System.out.println("Manager of this team is: " + this.manager);
    }
}



