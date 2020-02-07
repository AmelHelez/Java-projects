package ba.edu.ssst;

import java.util.ArrayList;

public class Department {
    private final String name;
    private ArrayList<Employee> list;

    public Department(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee e) {
        this.list.add(e);
    }

    public ArrayList<Employee> getList() {
        return list;
    }

    public int getHighestSalary() {
        int max = list.get(0).getSalary();
        for(Employee e : list) {
            if(e.getSalary() > max) max = e.getSalary();
        }
        return max;
    }


    public int getLowestSalary() {
        int min = list.get(0).getSalary();
        for(Employee e : list) {
            if(e.getSalary() < min) min = e.getSalary();
        }
        return min;
    }

    public int averageSalary() {
        int sum = 0;
        for(Employee e : list) {
            sum += e.getSalary();
        }
        return sum / list.size();
    }

    public int NumOfEmployees() {
        int sum = 0;
        for(Employee e : list) {
            sum += e.getSalary();
        }
        return 20000 - sum;
    }


    @Override
    public String toString() {
        return "Department name: " + this.name + "\nEmployee(s) : " + this.list;
    }
}
