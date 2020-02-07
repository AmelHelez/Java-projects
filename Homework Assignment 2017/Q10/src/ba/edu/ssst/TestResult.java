package ba.edu.ssst;

public class TestResult {
    private final String name;
    private final int score;

    public TestResult(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "(" + this.name + ", " + this.score + ")";
    }
}
