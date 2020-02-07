package ba.edu.ssst;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Number> nums = new ArrayList<>();
        System.out.println("Enter the numbers: ");
        Scanner in = new Scanner(System.in);
        int nr;

        do {
            nr = in.nextInt();
            if (nr >= 0) nums.add(new Number(nr));
        } while (nr >= 0);
        for (Number n : nums) {
            System.out.print(n + " ");
        }

        System.out.println("Now enter some numbers again: ");
        NumberCollection n = new NumberCollection();
        Scanner input = new Scanner(System.in);
        int nr2 = input.nextInt();

        while (nr2 != 0) {
            n.add(nr2);
            n.Sum();
            if (n.Sum() > 100) {
                System.out.print("Sum is: " + n.Sum());
                break;
            }
            nr2 = input.nextInt();
        }
        System.out.println(n);
    }

}
