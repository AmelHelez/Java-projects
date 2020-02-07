package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        Singleton.getInstance().list.add(new Student("Leo","Messi",10));
        Singleton.getInstance().list.add(new Student("Robert","Lewandowski",10));
        Singleton.getInstance().list.add(new Student("Asim","Zec",5));
        Singleton.getInstance().list.add(new Student("Niklas","Sule",9));
        Singleton.getInstance().list.add(new Student("James","Rodriguez",7));
        Singleton.getInstance().list.add(new Student("Joshua","Kimmich",9));
        Singleton.getInstance().list.add(new Student("David","Alaba",6));
        Singleton.getInstance().list.add(new Student("Marco","Reus",4));
        Singleton.getInstance().list.add(new Student("Izet","Fazlinovic",10));
        Singleton.getInstance().list.add(new Student("Leon","Goretzka",8));
        Singleton.getInstance().list.add(new Student("Eden","Hazard",4));
        Singleton.getInstance().list.add(new Student("LeBron","James",10));

        for(Student s : Singleton.getInstance().list) {
            System.out.println(s);
        }

        /*
        for(Student s : students) {
            System.out.println(s); // just for the test in the end
            System.out.println("------------");
        }
        */
        System.out.println("=====================");

        CountThread countThread = new CountThread();
        Thread t = new Thread(countThread);
        t.start();
        t.join();


        Singleton.getInstance().map.forEach((k,v) -> {
            System.out.println(v + " students got " +
                    k + " points.");
        });


      File file = new File("students.txt");
        Scanner s = new Scanner(file);

        while(s.hasNextLine()) {
            String line = s.nextLine();
            String[] elem = line.split(", ");

        }

    }
}
