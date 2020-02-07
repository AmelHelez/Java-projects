package org.launchcode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int arr[] = {23,31,44,59,91,42,55,2,11,4};
	for(int k = 0; k < arr.length; k++) {
		System.out.print(arr[k] + " ");
	}
		System.out.println();
	System.out.print("Please enter one number from the array: ");
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	System.out.print("Smaller numbers: ");
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] < number) System.out.print(arr[i] + " ");
	}
    }
}
