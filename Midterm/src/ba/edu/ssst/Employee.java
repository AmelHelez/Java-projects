package ba.edu.ssst;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final int salary;

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee name: " + this.firstName + " " + this.lastName
                + "\nSalary: " + this.salary;
    }
}
