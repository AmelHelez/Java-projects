package ba.edu.ssst;

import java.util.ArrayList;
import java.util.List;

public class Singleton {
    private static Singleton instance;
    public List<Integer> list;

    private Singleton() {
        list = new ArrayList<>();
    }

    public static Singleton getInstance() {
        if(instance == null) instance = new Singleton();
        return instance;
    }
}
