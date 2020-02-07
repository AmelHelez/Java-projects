package ba.edu.ssst;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        for(int i = 0; i < 20; i++) {
            array[i] = random.nextInt(101) + 50;
        }
        for (int a: array) {
            System.out.print(a + " ");
        }
        Arrays.sort(array);
        System.out.println();
        for(int a: array) {
            if(a % 2 == 0 && a < 100)
                System.out.print(a + " ");
        }
    }
}
