package ba.edu.ssst;

public class Sync {
    static Object obj = new Object();
    public static Boolean contains = false;

    public static void UpdateContains(Boolean newContains) {
        synchronized (obj) {
            if(contains != true) {
                contains = newContains;
            }
        }
    }
}
