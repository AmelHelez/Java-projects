package ba.edu.ssst;

public class Student extends Person {
    private int year;

    public Student(String f_name,String l_name,int year) {
        super(f_name, l_name);
        this.year = year;
    }

    public Boolean willPass() {
        return false;
    }

    public int getYear() {
        return year;
    }


}
