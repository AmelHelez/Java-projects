package ba.edu.ssst;

import java.security.InvalidParameterException;

public class Student {
    private final String ime;
    private final String prezime;
    private int numOfPoints;

    public Student(String ime, String prezime, int numOfPoints) {
        this.ime = ime;
        this.prezime = prezime;
        if(numOfPoints < 1 || numOfPoints > 10) throw new InvalidParameterException("Error.");
        this.numOfPoints = numOfPoints;
    }

    public int getNumOfPoints() {
        return numOfPoints;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIme() {
        return ime;
    }

    @Override
    public String toString() {
        return "Name: " + getIme() + " " + getPrezime()
                + "\nNumber of points: " + getNumOfPoints();
    }
}
