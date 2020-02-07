package ba.edu.ssst;

public class MasterStudent extends Person{
    public MasterStudent(String f_name, String l_name) {
        super(f_name, l_name);
    }

    public String getMentorName() {
        return "No mentor yet.";
    }

    @Override
    public String toString() {
        return "Master Student";
    }

}
