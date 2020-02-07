package ba.edu.ssst;

import java.util.ArrayList;

public class Students {
    private ArrayList<Student> students;

    public Students() {
        this.students = new ArrayList<>();
    }

    public Students(ArrayList<Student> students) {
        this.students = students;
    }

    public String StudentBestScore() {
        for (Student s : students) {
         max = s.getBestScore();
        }
    }
    public String StudentWorstScore() {
        for(Student s: students)
            if(s.getBestScore() == max) return s.toString();
    }

}
