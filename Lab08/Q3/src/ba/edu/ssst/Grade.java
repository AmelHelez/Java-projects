package ba.edu.ssst;

public class Grade {
    private final int numberOfPoints;
    private String finalGrade;
    private Course course;


    public Grade(int numberOfPoints, Course course) {
        this.numberOfPoints = numberOfPoints;
        this.course = course;
    }


}
