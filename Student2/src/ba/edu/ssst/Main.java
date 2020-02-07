package ba.edu.ssst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();

    students.add(new Student("Marko",8.7));
    students.add(new Student("Dvejn",9.3));
    students.add(new Student("Lebron",3.6));
    students.add(new Student("Partisha",9.1));

        for (Student s: students) {
            System.out.println(s);
        }
    }
}
