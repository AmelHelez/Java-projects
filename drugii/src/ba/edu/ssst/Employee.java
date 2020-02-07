package ba.edu.ssst;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String depName;
    private final int salary;

    public Employee(String firstName, String lastName, String depName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.depName = depName;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getDepName() {
        return depName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.depName + " " + this.salary;
    }
}
