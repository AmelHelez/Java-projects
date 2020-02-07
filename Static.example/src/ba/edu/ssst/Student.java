package ba.edu.ssst;

public class Student {
    private final String f_name;
    private final String l_name;
    private final int points;

    public Student(String f_name,String l_name,int points) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.points = points;
    }

    public int getPoints() {
        return this.points;
    }


}
