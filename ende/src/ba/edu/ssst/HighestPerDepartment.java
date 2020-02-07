package ba.edu.ssst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HighestPerDepartment implements Runnable {
    ArrayList<Employee> departments = new ArrayList<>();
    int number = 0;

    Map<String,ArrayList<Employee>> map = new HashMap<>();
  public HighestPerDepartment() {
      this.departments = new ArrayList<>();
  }

    @Override
    public void run() {
        int total = 0;
    for(Department d : Singleton.getInstance().departments) {
        total = departments.get(0).getSalary();

        for(Employee e : departments) {
            if(e.getSalary() > total) total = e.getSalary();
        }
    }
    System.out.println(total);
    }
}
