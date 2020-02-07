package ba.edu.ssst;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String department;
    private final int salary;

    public Employee(String firstName, String lastName, String department, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " +
                this.department + " " + this.salary;
    }
}
