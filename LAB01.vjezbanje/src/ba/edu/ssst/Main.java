package ba.edu.ssst;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int nr;

        do {
            nr = input.nextInt();
            if(nr >= 0) numbers.add(new Number(nr));
        } while(nr >= 0);

        for (Number n: numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        NumberCollection collection = new NumberCollection();
        System.out.print("Enter the numbers: ");
        int nr2 = input.nextInt();

        while(nr2 != 0){
            collection.add(nr2);
            collection.Sum();
            if(collection.Sum() > 100) {
                System.out.println("Sum is: " + collection.Sum());
                break;
            }
            nr2 = input.nextInt();
        }
        System.out.println(collection);
    }
}
