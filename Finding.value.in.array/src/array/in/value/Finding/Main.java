package array.in.value.Finding;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int arr[];
	System.out.print("Enter the size of the array: ");
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	int[] numbers = new int[num];

	for(int i = 0; i < numbers.length; i++) {
	    System.out.print("Enter number " + (i + 1) + " : ");
        numbers[i] = input.nextInt();
        System.out.println();
    }
       int counter = 0;
       System.out.print("Now please enter the specified number: ");
        Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
        for(int i = 0; i < numbers.length; i++) {
            if(n == numbers[i]) {
                counter++;
            }

        }
        if(counter == 0) {
            System.out.print("Item is not in the list.");
        }
        else {
            System.out.print("Item is in the list.");
        }
    }
}
