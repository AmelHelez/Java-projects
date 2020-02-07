package ba.edu.ssst;

import java.util.ArrayList;

public class Student {
    private final String ime;
    private final String prezime;
    private ArrayList<TestResult> results;

    public Student(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        results = new ArrayList<>();
    }

    public Student(String ime,String prezime, ArrayList<TestResult> results) {
        this.ime = ime;
        this.prezime = prezime;
        this.results = results;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public ArrayList<TestResult> getResults() {
        return results;
    }

    public double getAverage() {
        int sum = 0;
        for (TestResult tr: results) {
            sum += tr.getScore();
        }
        return  sum / results.size();
    }

    public int getWorstScore() {
        int min = results.get(0).getScore();
        for(TestResult tr: results) {
            if(tr.getScore() < min) {
                min = tr.getScore();
            }
        }
        return min;
    }

    public int getBestScore() {
        int max = results.get(0).getScore();
        for(TestResult tr: results) {
            if(tr.getScore() > max) {
                max = tr.getScore();
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return this.ime + " " + this.prezime + " " + this.results;
    }
}
