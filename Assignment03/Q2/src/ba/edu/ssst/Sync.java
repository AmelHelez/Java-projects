package ba.edu.ssst;

public class Sync {
    static Object obj = new Object();

    public static Employee largest;
    public static Employee lowest;

    public static void displayLargest(Employee newLargest) {
        synchronized (obj) {
            largest = newLargest;
        }
    }

    public static void displayLowest(Employee newLowest) {
        synchronized (obj) {
            lowest = newLowest;
        }
    }

}
