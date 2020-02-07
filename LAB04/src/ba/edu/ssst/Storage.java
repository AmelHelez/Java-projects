package ba.edu.ssst;

import java.util.ArrayList;

public class Storage {
    private static Storage instance;

    public ArrayList<Team> teams;

    private Storage() {
        teams = new ArrayList<Team>();
    }

    public static Storage getInstance() {
        if(instance == null) {
            instance = new Storage();
        }
        return instance;
    }
}
