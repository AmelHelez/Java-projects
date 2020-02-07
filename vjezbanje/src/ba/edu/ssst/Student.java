package ba.edu.ssst;

public class Student {
    private final String ime;
    private final String prezime;
    private int points;

    public Student(String ime, String prezime, int points) {
        this.ime = ime;
        this.prezime = prezime;
        if(points < 1 || points > 10) throw new IllegalArgumentException("Points error!");
        this.points = points;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getPoints() {
        return points;
    }

    public String getIme() {
        return ime;
    }


    public String getFullName() {
        return ime + " " + prezime;
    }
    @Override
    public String toString() {
        return "Name: " + getFullName() + "\nTotal number of points: " + getPoints();
    }
}
