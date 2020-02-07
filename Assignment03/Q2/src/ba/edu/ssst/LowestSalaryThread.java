package ba.edu.ssst;

import java.util.ArrayList;

public class LowestSalaryThread implements Runnable {
    ArrayList<Employee> employees = new ArrayList<>();
    Employee e1;

    public LowestSalaryThread(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void run() {
        int lowestSalary = employees.get(0).getSalary();
        for(Employee e : employees) {
            if (e.getSalary() < lowestSalary) {
                lowestSalary = e.getSalary();
                e1 = new Employee(e.getFirstName(), e.getLastName(), e.getDepartment(), lowestSalary);
            }
        }
        //System.out.println(e1);
        Sync.displayLowest(e1);

    }
}
