package org.launchcode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int sum = 0;
	System.out.print("Please enter the number: ");
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	for(int i = 1; i < n; i++) {
	    if(i % 3 == 0 || i % 5 == 0) sum += i;
    }
    System.out.println("The sum is: " + sum);
    }
}
