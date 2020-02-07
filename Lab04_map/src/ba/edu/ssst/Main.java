package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("members.txt");
            Scanner s = new Scanner(file);

            while(s.hasNextLine()) {
                String line = s.nextLine();
                String[] elements = line.split(",");
                if(elements.length == 4) {
                    String fName = elements[0].trim();
                    String lName = elements[1].trim();
                    String teamName = elements[2].trim();
                    Boolean captain = Boolean.parseBoolean(elements[3].trim());

                    TeamMember tm = new TeamMember(fName,lName,captain);

                    if(Storage.getInstance().members.containsKey(teamName)) {
                        ArrayList<TeamMember> members = Storage.getInstance().members.get(teamName);
                        members.add(tm);
                        Storage.getInstance().members.put(teamName,members);
                    } else {
                        ArrayList<TeamMember> members = new ArrayList<>();
                        members.add(tm);
                        Storage.getInstance().members.put(teamName,members);
                    }
                }
            }
            Storage.getInstance().members.forEach((teamName,members) -> {
                System.out.println(String.format("Team %s has the following members: ", teamName));
                for(TeamMember member : members) {
                    System.out.println(member);
                }
                System.out.println("==========================");
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
