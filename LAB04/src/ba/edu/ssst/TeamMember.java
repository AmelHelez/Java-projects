package ba.edu.ssst;

public class TeamMember {
    private final String firstName;
    private final String lastName;
    private final Boolean captain;


    public TeamMember(String firstName, String lastName, Boolean captain) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.captain = captain;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean isCaptain() {
        return captain;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
        "\nCaptain: " + (captain ? "is captain!" : "");
    }
}
