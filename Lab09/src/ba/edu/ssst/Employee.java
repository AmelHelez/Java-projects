package ba.edu.ssst;

public class Employee {
    private final String first_name;
    private final String last_name;
    private final int salary;

    public Employee(String first_name, String last_name, int salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
    }

    public String getLastName() {
        return last_name;
    }

    public String getFirstName() {
        return first_name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + this.first_name + " "
                + this.last_name + "\nSalary: "
                + this.salary;
    }
}
