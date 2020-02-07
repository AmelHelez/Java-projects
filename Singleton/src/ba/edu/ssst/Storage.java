package ba.edu.ssst;

import java.util.ArrayList;

public class Storage {
    private static Storage instance;

    public ArrayList<Person> names;

    private Storage() {
        names = new ArrayList<>();
    }

    public static Storage getInstance() {
        if(instance == null) {
            instance = new Storage();
        }
        return instance;
    }
}
