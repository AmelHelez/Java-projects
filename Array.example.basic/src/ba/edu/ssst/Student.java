package ba.edu.ssst;

public class Student {
    private final String f_name;
    private final String l_name;

    public Student(String f_name,String l_name) {
        this.f_name = f_name;
        this.l_name = l_name;
    }

    public String getFirstName() {
        return f_name;
    }

    @Override
    public String toString() {
        return this.f_name + " " + this.l_name;
    }


}
