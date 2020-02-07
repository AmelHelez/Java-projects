package ba.edu.ssst;

import java.util.ArrayList;

public class CountThread implements Runnable {
    ArrayList<Student> students;

    public CountThread() {
        this.students = new ArrayList<>();
    }

    @Override
    public void run() {
    for(Student s : Singleton.getInstance().list) {
        if(Singleton.getInstance().mapa.containsKey(s.getNumOfPoints())) {
            Integer i = Singleton.getInstance().mapa.get(s.getNumOfPoints());
            Singleton.getInstance().mapa.put(s.getNumOfPoints(),i+1);
        } else Singleton.getInstance().mapa.put(s.getNumOfPoints(),1);
    }
    }
}
