package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("shops.txt");
        Scanner s = new Scanner(file);
        Map<String,ArrayList<Shop>> mapa = new HashMap<>();

        while(s.hasNextLine()) {
            String line = s.nextLine();
            String[] elements = line.split(",");

            if(elements.length == 6) {
                String Shopname = elements[0].trim();
                String Servicename = elements[1].trim();
                Date dateOpened = Date.parseDate(elements[2].trim());
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
