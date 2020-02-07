package ba.edu.ssst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Storage {
    private static Storage instance;

    public Map<String, ArrayList<TeamMember>> members;

    private Storage() {
        this.members = new HashMap();
    }

    public static Storage getInstance() {
        if(instance == null) {
            instance = new Storage();
        }
        return instance;
    }
}
