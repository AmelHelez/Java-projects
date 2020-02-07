package ba.edu.ssst;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String indexNumber;
    private final String dateOfBirth;

    public Student(String firstName, String lastName, String indexNumber, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return this.firstName + ", " + this.lastName +
                ", " + this.indexNumber + ", " + this.dateOfBirth;
    }
}
