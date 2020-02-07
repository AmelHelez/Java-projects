package ba.edu.ssst;

public class Student extends Person {
    public Student(String firstname,String lastname) {
        super(firstname, lastname);
    }

    @Override
    public String toString() {
        return "Student";
    }
}
