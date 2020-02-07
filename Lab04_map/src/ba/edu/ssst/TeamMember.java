package ba.edu.ssst;

public class TeamMember {
    private final String first_name;
    private final String last_name;
    private final Boolean captain;

    public TeamMember(String first_name, String last_name, Boolean captain) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.captain = captain;
    }

    public Boolean isCaptain() {
        return captain;
    }

    public String getLastName() {
        return last_name;
    }

    public String getFirstName() {
        return first_name;
    }

    @Override
    public String toString() {
        return "Name: " + this.first_name + " " + this.last_name
                + (captain? " - IS CAPTAIN !" : "");
    }
}
