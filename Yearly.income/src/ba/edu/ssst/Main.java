package ba.edu.ssst;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.print("Please enter an income that will be calculated: ");
    Scanner input = new Scanner(System.in);
    int income = input.nextInt();


    if(income < 10000) {
        System.out.print("The tax is: " + (income * 0.07));
    }
    else if(income >= 10000 && income <= 25000) {
        System.out.print("The tax is: " + (income * 0.12));
    }
    else if(income > 25000) {
        System.out.print("The tax is: " + (income * 0.17));
    }
    }
}
