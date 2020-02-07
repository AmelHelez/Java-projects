package ba.edu.ssst;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("employees.txt");
        Scanner s = new Scanner(file);
        Map<String,ArrayList<Employee>> mapa = new HashMap<>();

        while(s.hasNextLine()) {
            String line = s.nextLine();
            String[] elements = line.split(",");

            if(elements.length == 4) {
                String name = elements[0].trim();
                String surname = elements[1].trim();
                String depName = elements[2].trim();
                Integer salary = Integer.parseInt(elements[3].trim());

                Employee e = new Employee(name,surname);


            if(mapa.containsKey(depName)) {
                ArrayList<Employee> employees = mapa.get(depName);
                employees.add(e);
                mapa.put(depName,employees);
            } else {
                ArrayList<Employee> employees = new ArrayList<>();
                employees.add(e);
                mapa.put(depName,employees);
            }
            }
        }

        mapa.forEach((k,v) -> {
            try {
                PrintWriter pw = new PrintWriter(k+".txt");
                pw.println(String.format("Department %s has the following employees: ", k));
                for(Employee e : v) {
                    pw.println(e);
                }
                pw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();

            }
        });

    }
}
