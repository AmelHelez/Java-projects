package ba.edu.ssst;

import java.util.ArrayList;

public class Team {
    private ArrayList<TeamMember> members;
    private final String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
        members = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public ArrayList<TeamMember> getMembers() {
        return members;
    }

    public void addMembers(TeamMember tm) {
        this.members.add(tm);
    }


}
