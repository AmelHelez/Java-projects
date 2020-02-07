package ba.edu.ssst;

import java.util.ArrayList;
import java.util.List;

public class Sync {
    public static Object obj = new Object();
    public static List<Integer> lista = new ArrayList<>();

    public static void add(Integer number) {
        synchronized (obj) {
            lista.add(number);
        }
    }
}
