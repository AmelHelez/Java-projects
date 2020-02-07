package ba.edu.ssst;

import java.util.ArrayList;
import java.util.List;

public class Sync {
    public static Object obj = new Object();

   public static List<Integer> list = new ArrayList<>();

    public static void outPut(Integer number) {
        synchronized (obj) {
            list.add(number);
        }
    }
}
