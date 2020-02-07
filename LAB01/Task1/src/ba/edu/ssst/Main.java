package ba.edu.ssst;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Number> lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int nr;
        System.out.print("Enter the numbers: ");

        do {
            nr = input.nextInt();

            if(nr >= 0) {
                lista.add(new Number(nr));
            }
        } while(nr >= 0);

        System.out.print("The numbers are: ");
        for(Number i: lista) {
            System.out.print(i + " ");
        }

    }
}

