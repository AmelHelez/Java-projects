package ba.edu.ssst;

import java.util.ArrayList;

public class Manager {
    protected String department;
    protected String name;
    protected double budget;


    public Manager(String department, String name, double budget) {
        this.department = department;
        this.name = name;
        this.budget = budget;
    }


    public String getDepartment() {
        return department;
    }


    public void setDepartment(String department) {
        this.department = department;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getBudget() {
        return budget;
    }


    public void setBudget(double budget) {
        this.budget = budget;
    }


    @Override
    public String toString() {
        return "Manager [department=" + department + ", name=" + name + ", budget=" + budget + "]";
    }


    public void getDepartmentStats(ArrayList<Employee> employeeList) {
        double totalSalary = 0;
        double remainingBudget = this.getBudget();

        for (Employee e : employeeList) {
            if (this.getDepartment().equals(e.getDepartment())) {
                totalSalary += e.getSalary();
                remainingBudget -= e.getSalary();
            }
        }

        System.out.printf("Manager %s of department %s has %.2f total in salaries and %.2f remaining in the budget [original: %.2f]\n",
                this.getName(), this.getDepartment(), totalSalary, remainingBudget, this.getBudget());
    }






}
