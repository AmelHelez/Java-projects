package ba.edu.ssst;

import java.util.ArrayList;

public class NumberCollection {
    private ArrayList<Integer> numbersArray;

    public NumberCollection() {
        this.numbersArray = new ArrayList<Integer>();
    }

    public void add(int n) {
        this.numbersArray.add(n);
    }

    public int Sum() {
        int sum = 0;
        for(int i = 0; i < numbersArray.size(); i++) sum += numbersArray.get(i);
        return sum;
    }

    @Override
    public String toString() {
        return this.numbersArray + "";
    }
}
