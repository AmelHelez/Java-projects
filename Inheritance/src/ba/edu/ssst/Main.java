package ba.edu.ssst;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	Person p = new Person("Che","Guevarra","1/1/1901");
	Student s = new Student("Charlie","Chaplin",4);

	Person student = new Student("Dvejn","Vejd",16);

	ArrayList<Person> members = new ArrayList<>();
	members.add(new Person("","",""));
	members.add(new Student("","",2));
	members.add(new Employee());

	System.out.println("Person: " + p);
	System.out.println("Student: " + s);
	System.out.println("Will pass: " + s.willPass());
	System.out.println("Person who is a student: " + student);
    }
}
