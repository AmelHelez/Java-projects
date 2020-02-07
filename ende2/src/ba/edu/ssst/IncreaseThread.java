package ba.edu.ssst;

public class IncreaseThread implements Runnable {
    private int start;
    private int end;

    public IncreaseThread(int start, int end) {
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
