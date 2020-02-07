package ba.edu.ssst;

public class TeamMember {
    private final String ime;
    private final String prezime;
    private final Boolean captain;

    public TeamMember(String ime, String prezime, Boolean captain) {
        this.ime = ime;
        this.prezime = prezime;
        this.captain = captain;
    }

    public String getLastName() {
        return prezime;
    }

    public String getFirstName() {
        return ime;
    }

    public Boolean getCaptain() {
        return captain;
    }

    @Override
    public String toString() {
        return "Name: " + this.ime + " " + this.prezime
                + (captain ? " is CAPTAIN " : "");
    }
}
