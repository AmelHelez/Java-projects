package ba.edu.ssst;

public class Course {
    private final String courseName;
    private final int availablePoints;


    public Course(String courseName, int availablePoints) {
        this.courseName = courseName;
        this.availablePoints = availablePoints;
    }

    public int getAvailablePoints() {
        return availablePoints;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return this.courseName + " " + this.availablePoints;
    }
}
