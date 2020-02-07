package ba.edu.ssst;

import java.util.ArrayList;

public class LowestSalaryThread implements Runnable{
    ArrayList<Employee> employees = new ArrayList<>();
    Employee e1;

    public LowestSalaryThread(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void run() {
        Integer lowest = employees.get(0).getSalary();
        for(Employee e : employees) {
            if(e.getSalary() < lowest) {
                lowest = e.getSalary();
                e1 = new Employee(e.getFirstName(), e.getLastName(), e.getDepartment(), lowest);
            }
        }


        System.out.println(e1);
        Sync.displaySmallest(e1);
    }
}
