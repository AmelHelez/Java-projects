package ba.edu.ssst;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

    Random r = new Random();
    int sum1 = 0;

    for(int i = 0; i < 1000; i++) {
        Singleton.getInstance().array.add(r.nextInt(500));
        sum1 += Singleton.getInstance().array.get(i);
    }


    // System.out.println(Singleton.getInstance().array);
    System.out.println("First sum: " + sum1);
        ArrayList<Thread> threads = new ArrayList<>(); // we need this for 5 threads

        for(int i = 0; i < 5; i++) {
            Threadd function = new Threadd(i * 200, 200 + i * 200);
            Thread t = new Thread(function);
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


        int sum2 = 0;
        System.out.println("================================");
        for(Integer i : Singleton.getInstance().array) {
            sum2 += i;
        }

        // System.out.println("Numbers: \n" + Singleton.getInstance().array);
      System.out.println("New sum: " + sum2);
    }

}
