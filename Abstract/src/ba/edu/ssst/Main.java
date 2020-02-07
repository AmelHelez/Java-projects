package ba.edu.ssst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> students = new ArrayList();

        Person p1 = new Student("Test", "Student");
        students.add(p1);

        students.add(new Student("Test", "Student 2"));

        students.add(new MasterStudent("Master", "Student"));

        for (Person p: students) {
            if (p.getClass() == MasterStudent.class) {
                System.out.print("Master Student: ");
            } else {
                System.out.print("Student: ");
            }
            System.out.println(p.getFirstname() + " " + p.getLastname());
        }
    }
}
