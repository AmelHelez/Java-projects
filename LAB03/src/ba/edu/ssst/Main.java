package ba.edu.ssst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<IEmployee> employees = new ArrayList<>();
        employees.add(new BlueCollarWorker(990,22));
        employees.add(new BlueCollarWorker(1000,21));
        employees.add(new BlueCollarWorker(1200,25));
        employees.add(new BlueCollarWorker(860,27));

        employees.add(new Manager(1500.32,19,13));
        employees.add(new Manager(1800,15,20));
        employees.add(new Manager(1400,20,3));

        employees.add(new Executive(20));

        //average salary of all employees

        double sum1 = 0;
        for (IEmployee e: employees) {
            sum1 += e.getSalary();
        }
        System.out.println("Average salary of all employees is: " + sum1 / employees.size());

        //average salary of Managers only

        double ManagerSum = 0;
        double cnt = 0;
        for (IEmployee e: employees) {
            if(e.getClass() == Manager.class) {
                ManagerSum += e.getSalary();
                cnt++;
            }
        }
        System.out.println("Average salary of managers is: " + ManagerSum/cnt);

        //total number of free days for all employees

        int free = 0;
        for (IEmployee e: employees) {
            free += e.numberOfFreeDays();
        }
        System.out.println("Number of free days for all employees is: " + free);

        //employees max and min earnings
        double min = employees.get(0).getEarnings();
        double max = employees.get(0).getEarnings();

        for (IEmployee e: employees) {
            if(e.getEarnings() < min) {
                min = e.getEarnings();
            }
        }
        System.out.println("Min earnings: " + min);

        for (IEmployee e: employees) {
            if(e.getEarnings() > max) {
                max = e.getEarnings();
            }
        }

        System.out.println("Max earnings: " + max);
    }
}
