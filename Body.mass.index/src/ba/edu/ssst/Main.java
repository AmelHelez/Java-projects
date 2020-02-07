package ba.edu.ssst;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the height: ");
        Scanner h = new Scanner(System.in);
        float height = h.nextFloat();
        System.out.print("Enter the weight: ");
        Scanner w = new Scanner(System.in);
        float weight = w.nextFloat();
        System.out.print("THE BMI is: ");
        float BMI = weight /(height*height);
        System.out.print(BMI);
    }
}
