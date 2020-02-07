package ba.edu.ssst;

public class TeamMember {
    private final String ime;
    private final String prezime;
    private Boolean captain;

    public TeamMember(String ime, String prezime, Boolean captain) {
        this.ime = ime;
        this.prezime = prezime;
        this.captain = captain;
    }

    public Boolean isCaptain() {
        return captain;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    @Override
    public String toString() {
        return "Name: " + this.ime + " " + this.prezime +
               "\nCaptain: " + (captain ? "(is captain!)" : "");
    }
}
