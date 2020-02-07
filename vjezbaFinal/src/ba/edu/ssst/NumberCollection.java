package ba.edu.ssst;

import java.util.ArrayList;

public class NumberCollection {
    private ArrayList<Integer> numbersArray;

    public NumberCollection() {
        this.numbersArray = new ArrayList<>();
    }

    public ArrayList<Integer> getNumbersArray() {
        return numbersArray;
    }

    public void add(int n) {
        this.numbersArray.add(n);
    }
    @Override
    public String toString() {
        return this.numbersArray + "";
    }
}
