package ba.edu.ssst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Singleton {
    private static Singleton instance;
    public Map<Integer, Integer> map;
    public ArrayList<Student> list;

    private Singleton() {
      this.map = new HashMap<>();
      this.list = new ArrayList<>();
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
