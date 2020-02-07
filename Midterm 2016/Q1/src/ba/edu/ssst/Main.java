package ba.edu.ssst;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Enter yearly income in KM: ");
     int income = in.nextInt();
     double tax = 0;

     if(income < 10000) {
         tax = income * 0.07;
     } else if(income >= 10000 && income <= 25000) {
         tax = income * 0.12;
     } else if(income > 25000) {
         tax = income * 0.17;
     }
     System.out.print("The tax is: " + tax);
    }
}
