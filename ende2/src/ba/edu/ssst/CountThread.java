package ba.edu.ssst;

import java.util.ArrayList;
import java.util.zip.CheckedOutputStream;

public class CountThread implements Runnable {
    ArrayList<Student> students;

    public CountThread() {
        this.students = Storage.getInstance().students;
    }
    @Override
    public void run() {
     for(Student s : Storage.getInstance().students) {
         if(Storage.getInstance().map.containsKey(s.getNumb_of_points())) {
             Integer nr = Storage.getInstance().map.get(s.getNumb_of_points());
             Storage.getInstance().map.put(s.getNumb_of_points(),nr + 1);

         } else {
             Storage.getInstance().map.put(s.getNumb_of_points(), 1);
         }
     }
    }
}
