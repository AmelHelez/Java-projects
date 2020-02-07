package smallest.num.in.array;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int arr[] = {31,24,30,25,32,3};
	int smallest = arr[0];

	for(int i = 1; i < arr.length; i++) {
	    if(arr[i] < smallest) smallest = arr[i];
    }
    System.out.println("The smallest number in the array is " + smallest);
    }
}
