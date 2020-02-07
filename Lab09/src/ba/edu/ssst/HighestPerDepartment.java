package ba.edu.ssst;

import java.util.ArrayList;

public class HighestPerDepartment implements Runnable {
    ArrayList<Employee> employees = new ArrayList<>();
    Integer total = 0;

    public HighestPerDepartment(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void run() {
        for (Department department : Singleton.getInstance().departments) {
            for(Employee e : employees) {
                total += e.getSalary();
            }
        }
    }
}
