package ba.edu.ssst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Storage {
    private static Storage instance;
    public Map<Integer,Integer> map;
    public ArrayList<Student> students;


    private Storage() {
        this.students = new ArrayList<>();
        this.map = new HashMap<>();
    }

    public static Storage getInstance() {
        if(instance == null) instance = new Storage();
        return instance;
    }
}
