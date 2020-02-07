package ba.edu.ssst;

import java.util.ArrayList;

public class Department {
    private final String depName;
    private ArrayList<Employee> employees;

    public Department(String depName) {
        this.depName = depName;
        this.employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public String getDepName() {
        return depName;
    }
    public void addEmployee(Employee e) {
        this.employees.add(e);
    }

    @Override
    public String toString() {
        return this.depName + "\n" + this.employees;
    }
}
