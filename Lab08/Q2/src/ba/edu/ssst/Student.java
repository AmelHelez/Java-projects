package ba.edu.ssst;

import java.awt.geom.IllegalPathStateException;
import java.security.InvalidParameterException;

public class Student {

    private final String first_name;
    private final String last_name;
    private Integer number;

    public Student(String first_name, String last_name, Integer number) {
        this.first_name = first_name;
        this.last_name = last_name;
        if(number < 1 || number > 10) throw new InvalidParameterException("The number of points must be in range from 1 to 10.");
        this.number = number;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public Integer getPoints() {
        return number;
    }

    @Override
    public String toString() {
        return "Name: " + this.first_name + " " + this.last_name
                + "\nNumber of points: " + this.number;
    }
}
