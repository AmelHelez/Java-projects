package ba.edu.ssst;

import java.util.ArrayList;
import java.util.List;

public class Threadd implements Runnable{
  private int start;
  private int end;

    public Threadd(int start, int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    public void run() {
       for(int i = start; i < end; i++) {
           int nr = Singleton.getInstance().array.get(i);
           Singleton.getInstance().array.set(i,nr + 10);
       }
    }
}
