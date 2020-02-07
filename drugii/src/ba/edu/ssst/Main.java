package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
     File file = new File("employees.txt");
        Scanner s = new Scanner(file);

        while(s.hasNextLine()) {
            String line = s.nextLine();
            String[] elem = line.split(", ");
            if(elem.length == 4) {
                String ime = elem[0].trim();
                String prezime = elem[1].trim();
                String depName = elem[2].trim();
                Integer salary = Integer.parseInt(elem[3].trim());

                ArrayList<Thread> threads = new ArrayList<>();

                for(int i = 0; i < 2; i++) {
                    HighestThread highestThread = new HighestThread()
                }
            }
        }
    }
}
