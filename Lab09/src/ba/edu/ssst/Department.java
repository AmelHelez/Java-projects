package ba.edu.ssst;

import java.util.ArrayList;

public class Department {
    private final String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployees(Employee e) {
        this.employees.add(e);
    }

    @Override
    public String toString() {
        return "Department name: " + this.name +
                "\nEmployees: " + this.employees;
    }
}
