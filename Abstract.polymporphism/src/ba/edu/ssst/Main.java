package ba.edu.ssst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       SalariedEmployee salariedEmployee = new SalariedEmployee("John","Smith","111-11-1111", 800.00);
       HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen","Prince","222-22-2222",16.75,40);
       CommisionEmployee commisionEmployee = new CommisionEmployee("Sue","Jones","333-33-3333",10000,.06);
       BasePlusCommisionEmployee basePlusCommisionEmployee;
       basePlusCommisionEmployee = new BasePlusCommisionEmployee("Bob","Lewis","444-44-4444",5000,.04,300);
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(salariedEmployee);
        employees.add(hourlyEmployee);
        employees.add(commisionEmployee);
        employees.add(basePlusCommisionEmployee);
        for (Employee e: employees) {
            System.out.println("-------------");
            System.out.println(e);
            System.out.println("Earnings: " + e.earnings());
            System.out.println("-------------");
        }
    }
}
