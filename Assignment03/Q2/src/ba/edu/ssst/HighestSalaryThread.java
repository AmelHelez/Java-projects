package ba.edu.ssst;

import java.util.ArrayList;

public class HighestSalaryThread implements Runnable {

    ArrayList<Employee> lista = new ArrayList<>();
    Employee e1;

    public HighestSalaryThread(ArrayList<Employee> lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        int highest = lista.get(0).getSalary();
        for(Employee e : lista) {
            if (e.getSalary() > highest) {
                highest = e.getSalary();
                e1 = new Employee(e.getFirstName(), e.getLastName(), e.getDepartment(), highest);
            }
        }
        //System.out.println(e1);
        Sync.displayLargest(e1);

    }
}
