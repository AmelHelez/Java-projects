package org.launchcode;
import java.util.Scanner;
public class NaDrugiNacin {
    public static void main(String[] args) {
        int largest = 0;
        int smallest = 0;
        int num;

        System.out.println("Enter the numbers: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 0; i < n; i++)
        {
            num = input.nextInt();
            if(num > largest) {
                largest = num;
            }
        }
        System.out.println("The largest is: " + largest);
    }
}
