package ba.edu.ssst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Storage.students = new ArrayList<>();
	Storage.students.add(new Student("Dwyane","Wade",99));
	Storage.students.add(new Student("LeBron","James",97));
	Storage.students.add(new Student("Dirk","Nowitzki",11));
	Storage.students.add(new Student("Leon","Benko",77));

	System.out.println("Number of students: " + Storage.getSize());

	Report report = new Report();
	System.out.println(report.avgPoints());
    }
}
