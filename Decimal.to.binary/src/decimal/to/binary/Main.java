package decimal.to.binary;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.print("Please enter the number: ");
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	int mask = 1;
	System.out.print("The number " + number + " in binary is ");
	for(int i = 3; i >= 0; i--) {
		int temp = number >> i;
		int binary = temp & mask;
		System.out.print(binary);
	}
    }
}
