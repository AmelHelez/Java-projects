package management.Student;

public class TestResult {
    private String test_name;
    private int score;

    public String GetTestName() {
        return test_name;
    }
    public int GetScore() {
        return score;
    }
    public TestResult(String test_name, int score) {
        this.test_name = test_name;
        this.score = score;
    }
    public String toString() {
        return "[ " + this.test_name + ", " + this.score + " ]";
    }
}
