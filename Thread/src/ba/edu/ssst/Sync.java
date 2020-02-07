package ba.edu.ssst;

import java.util.ArrayList;

public class Sync {
    static ArrayList<String> obj = new ArrayList<>();

    public static void updateContent(String content) {
        synchronized (obj) {
            obj.add(content);
        }
    }
}
