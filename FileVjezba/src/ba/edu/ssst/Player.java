package ba.edu.ssst;

public class Player {
    private final String firstName;
    private final String lastName;
    private final String position;
    private final int years;
    private final String country;


    public Player(String firstName, String lastName, String position, int years, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.years = years;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public int getYears() {
        return years;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Player name: " + this.firstName + " " + this.lastName + "\nPosition: " + this.position
                + "\nAge: " + this.years + "\nCountry: " + this.country;
    }
}
