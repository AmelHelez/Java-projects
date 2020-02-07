package ba.edu.ssst;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	EndOfYearThread e1 = new EndOfYearThread("2017");
	EndOfYearThread e2 = new EndOfYearThread("2018");
	EndOfYearThread e3 = new EndOfYearThread("2019");

	Thread t1 = new Thread(e1);
	Thread t2 = new Thread(e2);
	Thread t3 = new Thread(e3);

	t1.start(); t2.start(); t3.start();
	t1.join(); t2.join(); t3.join();

    System.out.println("All done!");

    Sync.obj.forEach(t -> System.out.print("\n" + t));
    }
}
