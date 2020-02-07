package ba.edu.ssst;

public class Course {
    private final String name;
    private final int totalNumberOfPoints;

    public Course(String name, int totalNumberOfPoints) {
        this.name = name;
        this.totalNumberOfPoints = totalNumberOfPoints;
    }

    public String getName() {
        return name;
    }

    public int getTotalNumberOfPoints() {
        return totalNumberOfPoints;
    }


}
