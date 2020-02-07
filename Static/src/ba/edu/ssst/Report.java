package ba.edu.ssst;

public class Report {
    public float avgPoints() {
        float sum = 0;
        for (Student s: Storage.students) {
            sum += s.getPoints();
        }
        return sum / Storage.getSize();
    }
}
