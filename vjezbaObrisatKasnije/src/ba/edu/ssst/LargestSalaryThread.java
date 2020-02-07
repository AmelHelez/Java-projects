package ba.edu.ssst;

import java.util.ArrayList;

public class LargestSalaryThread implements Runnable {
    ArrayList<Employee> employees = new ArrayList<>();
    Employee e1;

    public LargestSalaryThread(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void run() {
        Integer largest = employees.get(0).getSalary();
        for (Employee e : employees) {
            if (e.getSalary() > largest) {
                largest = e.getSalary();
                e1 = new Employee(e.getFirstName(),e.getLastName(),e.getDepartment(),largest);
            }
        }

    System.out.println(e1);
    Sync.displayLargest(e1);
    }
}
