package ba.edu.ssst;

public class Number {
    private final int number;

    public int GetNumber() {
        return number;
    }
    public Number(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.number + "";
    }
}