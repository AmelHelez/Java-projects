package ba.edu.ssst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        int testSum = 0;

        for(int i = 0; i < 1000; i++) {
            Singleton.getInstance().array.add(r.nextInt(10000));
            testSum += Singleton.getInstance().array.get(i);
        }

        System.out.println(testSum);


        ArrayList<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            IncreaseThread increaseThread = new IncreaseThread(i*200, 200 + i*200);
            Thread t = new Thread(increaseThread);
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

        int newSum = 0;
        for(int i = 0;i < 1000; i++) {
            newSum += Singleton.getInstance().array.get(i);
        }
        System.out.println(newSum);

        Map<Integer,Integer> mapa = new HashMap<>();
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Leo","Messi",10));
        students.add(new Student("Robert","Lewandowski",10));
        students.add(new Student("Asim","Zec",5));
        students.add(new Student("Niklas","Sule",9));
        students.add(new Student("James","Rodriguez",7));
        students.add(new Student("Joshua","Kimmich",9));
        students.add(new Student("David","Alaba",6));
        students.add(new Student("Marco","Reus",4));
        students.add(new Student("Izet","Fazlinovic",10));
        students.add(new Student("Leon","Goretzka",8));
        students.add(new Student("Eden","Hazard",4));
        students.add(new Student("LeBron","James",10));

/*
         for(Student s : students) {
             if (mapa.containsKey(s.getNumb_of_points())) {
                 Integer value = mapa.get(s.getNumb_of_points());
                 mapa.put(s.getNumb_of_points(), value + 1);
             } else {
                 mapa.put(s.getNumb_of_points(), 1);
             }
         }

         mapa.forEach((k,v) -> {
             System.out.println(v + " " + k);
         });
  */
         CountThread ct = new CountThread();
         Thread t = new Thread(ct);
         t.start();
         t.join();

         Storage.getInstance().map.forEach((k,v) -> {
             System.out.println(k + " " + v);
         });
    }
}
