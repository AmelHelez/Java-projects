package ba.edu.ssst;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> erej = new ArrayList<Integer>();
        erej.add(100);
        erej.add(10);
        erej.add(1);

        // Remove element
        erej.remove(2);

        // Change value
        erej.set(0, 50);

        for (Integer i: erej) {
            System.out.println(i);
        }

        Object o = new Object();
        System.out.println(o.toString());
        System.out.println(o.hashCode());

        System.out.println(erej);

        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("Super", "Student");
        students.add(s1);
        students.add(new Student("Not so Super", "Student"));

        ArrayList<Student> students2 = new ArrayList<>();
        students2.addAll(students);

        System.out.println(students);
        System.out.println(students.size());

        Scanner s = new Scanner(System.in);

        int number = s.nextInt();

        switch (number) {
            case 5:
                System.out.println("5");
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("!10");
        }
    }
}