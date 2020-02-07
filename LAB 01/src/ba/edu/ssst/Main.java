package ba.edu.ssst;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NumberCollection collection = new NumberCollection();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int nr = input.nextInt();

        while(nr != 0){
            collection.add(nr);
            collection.Sum();
            if(collection.Sum() > 100) {
                System.out.println("Sum is: " + collection.Sum());
                break;
            }
            nr = input.nextInt();
        }
        System.out.println(collection);
    }
}