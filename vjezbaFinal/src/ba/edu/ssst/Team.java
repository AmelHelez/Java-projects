package ba.edu.ssst;

import java.util.ArrayList;

public class Team {

        ArrayList<TeamMember> members;
        private final String teamName;

        public Team(String teamName) {
            this.teamName = teamName;
            this.members = new ArrayList<>();
        }

        public ArrayList<TeamMember> getMembers() {
            return members;
        }

        public String getTeamName() {
            return teamName;
        }

        public void addMember(TeamMember tm) {
            this.members.add(tm);
        }

    @Override
    public String toString() {
        return this.members + "";
    }
}


