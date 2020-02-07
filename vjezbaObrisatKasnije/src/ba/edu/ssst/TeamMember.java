package ba.edu.ssst;

public class TeamMember {
    private final String fname;
    private final String lname;
    private final Boolean captain;

    public TeamMember(String fname, String lname, Boolean captain) {
        this.fname = fname;
        this.lname = lname;
        this.captain = captain;
    }

    public String getLname() {
        return lname;
    }

    public String getFname() {
        return fname;
    }

    public Boolean getCaptain() {
        return captain;
    }

    @Override
    public String toString() {
        return this.fname + " " + this.lname +
                (this.captain ? " - IS A MOTHAFUCKING CAPTAIN!" : "");
    }
}
