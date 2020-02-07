package ba.edu.ssst;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> randomInts = new ArrayList<>();
        Random r = new Random();

        for(int i = 0; i < 1000000; i++) {
            randomInts.add(r.nextInt(100000000));
        }

        Integer targetNumber = 5;

        ArrayList<Thread> threads = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            List<Integer> subRandomInts = randomInts.subList(i * 100000, 100000 + i * 100000);
            NumberFinder numberFinder = new NumberFinder(subRandomInts,targetNumber);
            Thread t = new Thread(numberFinder);
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

        System.out.println(targetNumber + " is in array " + Sync.contains);
    }
}
