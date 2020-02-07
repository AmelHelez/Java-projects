package ba.edu.ssst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
   ArrayList<IEmployee> employees = new ArrayList<>();
   employees.add(new BlueCollarWorker(900,25));
   employees.add(new BlueCollarWorker(1100,20));
   employees.add(new BlueCollarWorker(1000,29));
   employees.add(new BlueCollarWorker(1200,23));

   employees.add(new Manager(1800,19,3));
   employees.add(new Manager(1400,22,7));
   employees.add(new Manager(1700,21,5));

   employees.add(new Executive(1000,10));

   //average salary of all employees
       double sum1 = 0;
        for (IEmployee e: employees) {
            sum1 += e.getSalary();
        }
        System.out.println("Average salary of all employees is " + sum1 / employees.size());

   //average salary of managers only
        double sumManager = 0;
        int cnt = 0;
        for (IEmployee e: employees) {
            if(e.getClass() == Manager.class) {
                sumManager += e.getSalary();
                cnt++;
            }
        }
        System.out.println("Average salary of managers is " + sumManager / cnt);

        //num of free days of all employees
        int freedays = 0;
        for (IEmployee e: employees) {
            freedays += e.numberOfFreeDays();
        }
        System.out.println("Number of free days is " + freedays);
      //max and min earnings of all employees
        double min = employees.get(0).getEarnings();
        double max = employees.get(0).getEarnings();

        for (IEmployee e: employees) {
            if(e.getEarnings() < min) min = e.getEarnings();
        }
        System.out.println("Min earning is " + min);

        for (IEmployee e: employees) {
            if(e.getEarnings() > max) max = e.getEarnings();
        }

        System.out.println("Max earning is " + max);
    }
}
