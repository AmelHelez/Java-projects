package ba.edu.ssst;

public class Student {
    private final String name;
    private final double average;
    private int studentNumber = 20170000;
    private static int counter = 0;

    public static void Cnt() {
        counter++;
    }

    public Student(String name,double average) {
        this.name = name;
        this.average = average;
        Cnt();
        this.studentNumber += counter;
    }

    @Override
    public String toString() {
        return this.name + " " + this.average + " " + this.studentNumber;
    }
}
