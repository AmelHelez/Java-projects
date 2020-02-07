package ba.edu.ssst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Storage.students = new ArrayList();

        Storage.students.add(new Student("Test 1", "Student", 80));
        Storage.students.add(new Student("Test 2" ,"Student", 30));
        Storage.students.add(new Student("Test 3", "Student", 60));
        Storage.students.add(new Student("Test 4", "Student", 50));

        System.out.println("Number of students: " + Storage.getSize());

        Report report = new Report();
        System.out.println(report.avgPoints());
    }
}
