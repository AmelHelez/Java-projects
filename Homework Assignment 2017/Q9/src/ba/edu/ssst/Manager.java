package ba.edu.ssst;

public class Manager {
    private final String firstName;
    private final String lastName;
    private final int yearsOfExp;


    public Manager(String firstName, String lastName, int yearsOfExp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsOfExp = yearsOfExp;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    @Override
    public String toString() {
        return "Manager name: " + this.firstName + " " + this.lastName
                + "\nYears of experience: " + this.yearsOfExp;
    }
}
