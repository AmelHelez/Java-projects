package ba.edu.ssst;

import java.util.ArrayList;
import java.util.List;

public class LessThan100 implements Runnable {
    List<Integer> list = new ArrayList<>();
    Integer stotka;

    public LessThan100(List<Integer> list) {
        this.list = list;
        stotka = 100;
    }
    @Override
    public void run() {
    for(Integer i : list) {
        if(i < this.stotka) Sync.add(i);
    }
    }
}
