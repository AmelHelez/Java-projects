package ba.edu.ssst;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
      /*  List<Integer> erej = new ArrayList<>();
        Random r = new Random();
        for(int i = 0; i < 1000; i++)
            erej.add(r.nextInt(100));

        ArrayList<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            List<Integer> subList = erej.subList(i*200,200+i*200);
            Threadd thr = new Threadd(subList);
            Thread t = new Thread(thr);
            t.start();
            threads.add(t);
        }

        threads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        int sum = 0;
        for(Integer i : Singleton.getInstance().list)
            sum += i;
        System.out.println("The sum is " + sum);
    */
      ArrayList<Student> students = new ArrayList<>();
      students.add(new Student("Amir","Hadzic",4));
      students.add(new Student("Amel","Helez",10));
      students.add(new Student("Filip","Cvitanusic",4));
      students.add(new Student("Rijad","Logo",5));
      students.add(new Student("Edim","Hadzic",7));
      Map<Integer,Integer> map = new HashMap<>();

      for(Student s : students) {
          if(map.containsKey(s.getNumOfPoints())) {
              Integer points = map.get(s.getNumOfPoints());
              map.put(s.getNumOfPoints(),points+1);
          } else map.put(s.getNumOfPoints(),1);
      }
      map.forEach((v,k) -> {
          System.out.println(v + " student(s) has/have " + k + " points.");
      });
    }
}
