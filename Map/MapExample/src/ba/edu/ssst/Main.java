package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	System.out.println("Inserting item");

	Map map = new TreeMap<String,Integer>();
	File file = new File("names.txt");
	Scanner s = new Scanner(file);

	while(s.hasNextLine()) {
		String line = s.nextLine();
		if(map.containsKey(line)) {
			Integer value = (Integer) map.get(line);
			map.put(line, value + 1);
		} else {
			map.put(line,1);
		}
	}

	map.forEach((k,v) -> System.out.println(k + " : " + v));

    }
}
