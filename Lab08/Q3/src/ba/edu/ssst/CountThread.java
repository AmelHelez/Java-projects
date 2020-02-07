package ba.edu.ssst;

import java.util.ArrayList;
import java.util.Map;

public class CountThread implements Runnable {

    private int start;
    private int end;

    ArrayList<Student> students;
    public CountThread() {
        this.students = Singleton.getInstance().list;
    }

    @Override
    public void run() {
        for(Student s : Singleton.getInstance().list) {
            if(Singleton.getInstance().map.containsKey(s.getPoints())) {
                Integer nr = Singleton.getInstance().map.get(s.getPoints());
                Singleton.getInstance().map.put(s.getPoints(), nr + 1);
            }
        }
    }
}
