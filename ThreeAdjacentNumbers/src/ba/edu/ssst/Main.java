package ba.edu.ssst;

import java.util.ArrayList;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     ArrayList<Integer> array = new ArrayList<>();
     Scanner in = new Scanner(System.in);
     Boolean isTrue = false;
     int x;

     for(int i = 0; i < 10; i++) {
         System.out.println("Please enter the " + (i + 1) + " number: ");
         x = in.nextInt();
         array.add(x);
     }
     for(int i = 0; i < 7; i++) {
         if (array.get(i) + 1 == array.get(i + 1) && array.get(i + 1) + 1 == array.get(i + 2)) {
             isTrue = true;
             break;
         }
     }

     if(isTrue) {
         System.out.println("TRUE");
     } else {
         System.out.println("FALSE");
     }
    }
}
