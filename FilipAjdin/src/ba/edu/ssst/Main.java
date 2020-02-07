package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("employees.txt");
        Scanner s = new Scanner(file);
        Map<Department, ArrayList<Employee>> company = new HashMap<>();

        while(s.hasNextLine()) {
            String line = s.nextLine();
            String[] elements = line.split(", ");

            if(elements.length == 4) {
                String ime = elements[0].trim();
                String prezime = elements[1].trim();
                String dep = elements[2].trim();

                Employee employee = new Employee(ime,prezime);
                Department department = new Department(dep);

                if(company.containsKey(department)) {
                    ArrayList<Employee> emps = company.get(department);
                    emps.add(employee);
                    company.put(department,emps);
                } else {
                    ArrayList<Employee> emps = new ArrayList<>();
                    emps.add(employee);
                    company.put(department,emps);
                }

            }
        }

        PrintWriter pw = new PrintWriter("dep1.txt");
        company.forEach((k,v) -> {
            pw.println(String.format("Department %s has following employees: ", k));
            for(Employee e : v) {
                pw.println(e);
            }
            pw.close();
        });

        PrintWriter pw2 = new PrintWriter("dep2.txt");
        company.forEach((k2,v2) -> {
            pw2.println(String.format("Department %s has following employees: ", k2));
            for(Employee e : v2) {
                pw2.println(e);
            }
            pw2.close();
        });

          company.forEach((k,v) -> {
              System.out.println(String.format("Department %s has following employees: ", k));
              for(Employee e : v) {
                  System.out.println(e);
              }
          });




    }
}
