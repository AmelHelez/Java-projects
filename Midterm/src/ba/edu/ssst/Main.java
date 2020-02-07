package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("employees.txt");
            Scanner s = new Scanner(file);

            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] elements = line.split(", ");

                if (elements.length == 4) {
                    String firstName = elements[0].trim();
                    String lastName = elements[1].trim();
                    String department = elements[2].trim();
                    Integer salary = Integer.parseInt(elements[3].trim());

                    Employee e = new Employee(firstName, lastName, salary);

                    boolean hasDepartment = false;

                    for (Department dep : Storage.getInstance().lista) {
                        if (dep.getName().equals(department)) {
                            hasDepartment = true;
                            break;
                        }
                    }
                    if (!hasDepartment) {
                        Storage.getInstance().lista.add(new Department(department));
                    }

                    for (Department dep : Storage.getInstance().lista) {
                        if (dep.getName().equals(department)) {
                            dep.addEmployee(e);
                        }
                    }
                }
            }
            int maxAll = Storage.getInstance().lista.get(0).getHighestSalary();
           /* for (Department dep : Storage.getInstance().lista) {
                for (Employee e : dep.getList()) {
                    if (e.getSalary() > maxAll) maxAll = e.getSalary();
                }
            }
            System.out.println("The highest salary is: " + maxAll);
*/

            for (Department dep : Storage.getInstance().lista) {
                System.out.println("Employee with highest salary for department " + dep.getName() + " is: " + dep.getHighestSalary());
            }
/*
            int minAll = Storage.getInstance().lista.get(0).getLowestSalary();
            for (Department dep : Storage.getInstance().lista) {
                for (Employee e : dep.getList()) {
                    if (e.getSalary() < minAll) minAll = e.getSalary();
                }
            }
            System.out.println("The lowest salary is: " + minAll);
*/
            for (Department dep : Storage.getInstance().lista) {
                System.out.println("Employee with lowest salary for department " + dep.getName() + " is: " + dep.getLowestSalary());
            }

         /*   for (Department dep : Storage.getInstance().lista) {
                System.out.println("The average for department " + dep.getName() + " is: " + dep.averageSalary());
            }*/
            int avgAll = 0;
            int cnt = 0;
            for (Department dep : Storage.getInstance().lista) {
                for (Employee e : dep.getList()) {
                    avgAll += e.getSalary();
                    cnt++;
                }

            }
            System.out.println("The average is : " + avgAll / cnt);

         /*   for(Department dep : Storage.getInstance().lista) {
                System.out.println("Number of employees department " + dep.getName() + " can hire is: " + dep.NumOfEmployees() / dep.averageSalary());
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
