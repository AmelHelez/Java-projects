package ba.edu.ssst;

import java.util.ArrayList;
import java.util.List;

public class LessThan100 implements Runnable{
    List<Integer> lista = new ArrayList<>();
    Integer stotka;

    public LessThan100(List<Integer> lista) {
        this.lista = lista;
        this.stotka = 100;
    }


    @Override
    public void run() {
        for(Integer i : lista) {
            if(i < this.stotka) {
                Sync.outPut(i);
            }

        }
    }
}
