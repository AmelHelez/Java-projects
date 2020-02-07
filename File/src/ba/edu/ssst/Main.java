package ba.edu.ssst;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Reading from file");
        System.out.println("==================");
        File file = new File("input.txt");

     ArrayList<String> collection = new ArrayList<>();

     try {
         Scanner s = new Scanner(file);
         while(s.hasNextLine()) {
             String name = s.nextLine();
             collection.add(name);
         }
     } catch(FileNotFoundException e) {
         System.out.println("No file");
     } catch(Exception e) {
         System.out.print("Unknown error");
        }
        for (String name: collection) {

            System.out.println(name);
        }
    }
}
