package ba.edu.ssst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Singleton {
    private static Singleton instance;
    public Map<Integer,Integer> mapa;
    public ArrayList<Student> list;

    private Singleton() {
        mapa = new HashMap<>();
        list = new ArrayList<>();
    }

    public static Singleton getInstance() {
        if(instance == null) instance = new Singleton();
        return instance;
    }
}
