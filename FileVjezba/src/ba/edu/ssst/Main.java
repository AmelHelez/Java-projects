package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	try {
	    File file = new File("teams.txt");
	    Scanner s = new Scanner(file);

	    while(s.hasNextLine()) {
	        String line = s.nextLine();
	        String[] elements = line.split(",");

	        if(elements.length == 6) {
	            String firstName = elements[0].trim();
	            String lastName = elements[1].trim();
	            String teamName = elements[2].trim();
	            String position = elements[3].trim();
	            Integer age = Integer.parseInt(elements[4].trim());
                String country = elements[5].trim();

	            Player player = new Player(firstName,lastName, position, age, country);

	            boolean hasTeam = false;
	            for(Team team : Storage.getInstance().teams) {
	                if(team.getTeamName().equals(teamName)) {
	                    hasTeam = true;
	                    break;
                    }
                }
                if(!hasTeam) {
                    Storage.getInstance().teams.add(new Team(teamName));
                }

                for(Team team : Storage.getInstance().teams) {
                    if(team.getTeamName().equals(teamName)) {
                        team.addPlayer(player);
                    }
                }
            }
        }

        for(Team team : Storage.getInstance().teams) {
            System.out.println(String.format("Team %s has following players:",team.getTeamName()));
            for(Player p : team.getPlayers()) {
                System.out.println(p);
            }
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    }
}
