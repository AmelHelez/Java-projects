package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Map<String,Person> map = new HashMap<>();

    try {
        File file = new File("names.txt");
        Scanner s = new Scanner(file);

        while(s.hasNextLine()) {
            String tempName = s.nextLine();
            Person p = new Person(tempName);

            if(map.containsKey(p.getName())) {
              Person person = map.get(p.getName());
              person.addNum();
              map.put(p.getName(),person);
            } else {
                map.put(p.getName(),p);
            }
        }

        System.out.println("Outputting to a file..");
        PrintWriter pw = new PrintWriter("hashmap_output.txt");
        map.forEach((key,value) -> pw.println(key + " : " + value));
        pw.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    }
}
