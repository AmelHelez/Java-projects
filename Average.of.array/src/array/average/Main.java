package array.average;

public class Main {

    public static void main(String[] args) {
	int arr[] = {23,2,5,51,99,56,22,23,7,69};
    int sum = 0;
    int counter = 0;
    for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
        System.out.println();

    for(int j = 0; j < arr.length; j++) {
        sum += arr[j]; counter++;
    }
    double d = sum/counter;
    System.out.print("The average is: " + d);
    }

}
