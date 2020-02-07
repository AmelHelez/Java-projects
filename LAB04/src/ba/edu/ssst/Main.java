package ba.edu.ssst;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        try {
            File file = new File("teams.txt");
            Scanner s = new Scanner(file);

            while(s.hasNextLine()) {
                String name = s.nextLine();
                String[] nameLineSplit = name.split(",");
                if(nameLineSplit.length == 4) {
                    String firstName = nameLineSplit[0].trim();
                    String lastName = nameLineSplit[1].trim();
                    String teamName = nameLineSplit[2].trim();
                    Boolean isCaptain = Boolean.parseBoolean(nameLineSplit[3].trim());
                    TeamMember tm = new TeamMember(firstName,lastName,isCaptain);

                    boolean hasTeam = false;
                    for (Team t: Storage.getInstance().teams) {
                        if(t.getTeamName().equals(teamName)) {
                            hasTeam = true;
                            break;
                        }
                    }
                    if(!hasTeam) {
                        Storage.getInstance().teams.add(new Team(teamName));
                    }

                    for(Team t: Storage.getInstance().teams) {
                        if(t.getTeamName().equals(teamName)) {
                            t.addTeamMember(tm);
                        }
                    }
                }
            }
            for(Team t: Storage.getInstance().teams) {
                System.out.println(String.format("Team %s has following members:",t.getTeamName()));
                for(TeamMember tm: t.getMembers()) {
                    System.out.println(tm);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
