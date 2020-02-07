package ba.edu.ssst;

import java.io.File;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     File file = new File("names.txt");

     try {
         Scanner scanner = new Scanner(file);
         while(scanner.hasNextLine()) {
             String nameLine = scanner.nextLine();
             String[] nameLineSplit = nameLine.split(",");
             if(nameLineSplit.length == 2) {
                 Person p = new Person(nameLineSplit[0],nameLineSplit[1]);
                 Storage.getInstance().names.add(p);
             }
         }
         Report report = new Report();
         report.print();
     } catch(InvalidParameterException e) {
         System.out.println(e.getMessage());
     } catch(Exception e) {
         System.out.println("No file found.");
     }
    }
}
