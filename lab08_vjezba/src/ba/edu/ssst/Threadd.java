package ba.edu.ssst;

import java.util.ArrayList;
import java.util.List;

public class Threadd implements Runnable {
    private List<Integer> list = new ArrayList<>();

    public Threadd(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
    for(Integer i : list) {
        i = i+10;
        Singleton.getInstance().list.add(i);
    }
    }
}
