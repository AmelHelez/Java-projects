package org.launchcode;
public class Main {

    static int arr[] = {10,20,19,34,31,25};
    static int largest() {
        int largest = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) largest = arr[i];
        }
        return largest;
    }
    public static void main(String[] args) {
	System.out.println("The largest number is: " + largest());
    }
}
