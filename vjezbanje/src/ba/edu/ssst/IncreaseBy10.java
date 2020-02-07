package ba.edu.ssst;

import java.util.List;

public class IncreaseBy10 implements Runnable{
    List<Integer> list;

    public IncreaseBy10(List<Integer> list) {
        this.list = list;
    }
    @Override
    public void run() {
        for(Integer i : list) {
            i = i+10;
            Singleton.getInstance().array.add(i);
        }
    }
}
