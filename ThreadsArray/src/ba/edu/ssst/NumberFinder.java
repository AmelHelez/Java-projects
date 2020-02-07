package ba.edu.ssst;

import java.util.List;

public class NumberFinder implements Runnable {
    static String resultString = "";
    List<Integer> numbers;
    Integer target;

    public NumberFinder(List<Integer> numbers,Integer target) {
        this.numbers = numbers;
        this.target = target;
    }

    @Override
    public void run() {
     Boolean result = numbers.contains(target);
     Sync.UpdateContains(result);
    }
}
