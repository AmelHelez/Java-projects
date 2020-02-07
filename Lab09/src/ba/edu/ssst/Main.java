package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Map<String,Integer> map = new TreeMap<>();
        File file = new File("employees.txt");
        Scanner s = new Scanner(file);

        while(s.hasNextLine()) {
            String line = s.nextLine();
            String[] elements = line.split(",");
            if(elements.length == 4) {
                String ime = elements[0].trim();
                String prezime = elements[1].trim();
                String name = elements[2].trim();
                Integer salary = Integer.parseInt(elements[3].trim());

                Employee e = new Employee(ime,prezime,salary);
                Department d = new Department(name);

            }
        }
    }
}
