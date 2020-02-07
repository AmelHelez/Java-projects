package ba.edu.ssst;

import java.util.*;

public class Main {

    public static void main(String[] args) {
         ArrayList<Integer> erej = new ArrayList<>();

        Random r = new Random();

        for(int i = 0; i < 100; i++) {
            erej.add(r.nextInt(100));
        }

        Collections.sort(erej);

        erej.forEach((value) -> System.out.println(value));
        for (Integer i: erej) {
            System.out.println(i);
        }


    }

}
