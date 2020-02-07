package ba.edu.ssst;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>();
    Random r = new Random();

    for(int i = 0; i < 1000000; i++) {
    	array.add(r.nextInt(10000000));
	}

	ArrayList<Thread> threads = new ArrayList<>();

    for(int i = 0; i < 5; i++) {
    	List<Integer> list = array.subList(i * 200000, 200000 + i * 200000);
    	LessThan100 function = new LessThan100(list);
    	Thread t = new Thread(function);
    	t.start();
    	threads.add(t);
	}

	threads.forEach(t -> {
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	});

    System.out.println("Numbers less than hundred: " + Sync.list);
	}

}
