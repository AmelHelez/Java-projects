package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	try {

	    File file = new File("students.txt");
	    Scanner s = new Scanner(file);

	    while(s.hasNextLine()) {
	        String line = s.nextLine();
	        String[] elements = line.split(",");

	        if(elements.length == 7) {
	            String ime = elements[0].trim();
	            String prezime = elements[1].trim();
	            String indexN = elements[2].trim();
	            String datum = elements[3].trim();
	            String course = elements[4].trim();
	            Integer max = Integer.getInteger(elements[5].trim());
	            Integer bodovi = Integer.getInteger(elements[6].trim());
            }
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
   */

	City city  = new City("Sarajevo");
    }
}
