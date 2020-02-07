package ba.edu.ssst;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int numb_of_points;

    public Student(String firstName, String lastName, int numb_of_points) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(numb_of_points < 1 || numb_of_points > 10) throw new IllegalArgumentException("It must be between 0 and 10!");
        this.numb_of_points = numb_of_points;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getNumb_of_points() {
        return numb_of_points;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.numb_of_points;
    }
}
