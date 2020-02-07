package ba.edu.ssst;

public class Player {
    private final String firstName;
    private final String lastName;
    private final int age;


    public Player(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Player name: " + this.firstName + " " + this.lastName
                + " Age: " + this.age;
    }
}
