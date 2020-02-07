package ba.edu.ssst;

import java.util.ArrayList;
import java.io.File;

public class Team {
   private final String teamName;
   private final ArrayList<TeamMember> members;

   public Team(String teamName) {
       this.teamName = teamName;
       members = new ArrayList<>();
   }

   public void addTeamMember(TeamMember member) {
       members.add(member);
   }

   public String getTeamName() {
       return teamName;
   }

   public ArrayList<TeamMember> getMembers() {
       return members;
   }
}


