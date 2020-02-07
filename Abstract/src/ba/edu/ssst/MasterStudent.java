package ba.edu.ssst;

public class MasterStudent extends Person {
    public MasterStudent(String firstname,String lastname) {
        super(firstname,lastname);
    }

    public String getMentorName() {
        return "No mentor yet";
    }

    @Override
    public String toString() {
        return "Master student";
    }
}
