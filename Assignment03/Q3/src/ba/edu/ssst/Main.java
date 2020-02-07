package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        File file = new File("employees.txt");
        Scanner s = new Scanner(file);
        Map<String,ArrayList<Employee>> map1 = new HashMap<>();
        Map<String,ArrayList<Manager>> map2 = new HashMap<>();

        while(s.hasNextLine()) {
            String line = s.nextLine();
            String[] elements = line.split(", ");
            if(elements.length == 4) {
                String fname = elements[0].trim();
                String lname = elements[1].trim();
                String dep = elements[2].trim();
                Integer salary = Integer.parseInt(elements[3]);

                Employee employee = new Employee(fname,lname,dep,salary);

                if(map1.containsKey(dep)) {
                    ArrayList<Employee> employees = map1.get(dep);
                    employees.add(employee);
                    map1.put(dep,employees);
                } else {
                    ArrayList<Employee> employees = new ArrayList<>();
                    employees.add(employee);
                    map1.put(dep,employees);
                }
            }
        }

       /* for(Employee e : list) {
            System.out.println(e);
        } */

       File f = new File("managers.txt");
       Scanner scanner = new Scanner(f);

       while(scanner.hasNextLine()) {
           String lajn = scanner.nextLine();
           String[] elem = lajn.split(", ");
           if(elem.length == 3) {
               String dep = elem[0].trim();
               String name = elem[1].trim();
               Integer budget = Integer.parseInt(elem[2].trim());

               Manager manager = new Manager(dep,name,budget);

              if(map2.containsKey(dep)) {
                 ArrayList<Manager> managers = map2.get(dep);
                 managers.add(manager);
                 map2.put(dep,managers);
              } else {
                  ArrayList<Manager> managers = new ArrayList<>();
                  managers.add(manager);
                  map2.put(dep,managers);
              }
           }
       }

       for(String key : map1.keySet()) {
           ArrayList<Employee> employees = map1.get(key);
           int ukupno = 0;
           int budget;
           for(Employee e : employees) {
               ukupno += e.getSalary();
           }
           System.out.print(String.format("Total salary for department %s is: ", key));
           System.out.println(ukupno);
           ArrayList<Manager> managers = map2.get(key);
           for(Manager m : managers) {
               budget = m.getBudget();
               System.out.println("The remaining budget for department " + key + " is: " + (budget - ukupno));
           }
           System.out.println("=====================");
       }

       for(String key : map1.keySet()) {
           ArrayList<Employee> employees = map1.get(key);
           employees.sort(Comparator.comparing(Employee::getSalary));
           Collections.reverse(employees);
           String n = key;
           int cnt = 0;
           PrintWriter pw = new PrintWriter(n + ".txt");
           for(Employee e : employees) {
               pw.println(e + "");
               cnt++;
               if(cnt > 9) break;
           }
                     pw.close();
       }
       // tried it with threads, maps, but this is the most efficient one (and the easiest)
    }
}
