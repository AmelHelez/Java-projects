package ba.edu.ssst;

import java.util.ArrayList;

public class Sync {
    static Object obj = new Object();
    static Employee largest;
    static Employee smallest;

    public static void displayLargest(Employee newLargest) {
        synchronized (obj) {
            largest = newLargest;
        }
    }

    public static void displaySmallest(Employee newSmallest) {
        synchronized (obj) {
            smallest = newSmallest;
        }
    }
}
