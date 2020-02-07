package ba.edu.ssst;

public class EndOfYearThread implements Runnable {

    String year;

    public EndOfYearThread(String year) {
        this.year = year;
    }

    @Override
    public void run() {
        try {
            if(this.year == "2018") Thread.sleep(5000);
            System.out.println(this.year);
            Sync.updateContent(this.year);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
