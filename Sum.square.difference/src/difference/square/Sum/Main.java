package difference.square.Sum;

public class Main {

    public static void main(String[] args) {
	int arr[] = {1,2,3,4,5};
	int sum1 = 0;
	for(int i = 0; i < arr.length; i++) {
	    sum1 += arr[i] * arr[i];
    }
    System.out.print(sum1);
        System.out.println();
        int sum2 = 0;
        for(int j = 0; j < arr.length; j++) {
            sum2 += arr[j];
        }
        int suma2 = sum2*sum2;
        System.out.print(suma2);
        int difference = suma2 - sum1;
        System.out.println();
        System.out.print("The difference is: " + difference);
    }

}
