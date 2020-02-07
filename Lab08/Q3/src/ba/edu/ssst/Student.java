package ba.edu.ssst;

import java.security.InvalidParameterException;

public class Student {

    private final String first_name;
    private final String last_name;
    private Integer number;
    //private Integer counter;

    public Student(String first_name, String last_name, Integer number) {
        this.first_name = first_name;
        this.last_name = last_name;
        if (number < 1 || number > 10)
            throw new InvalidParameterException("The number of points must be in range from 1 to 10.");
        this.number = number;
        //this.counter = 1;
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

    public void addNum() {
        this.number++;
    }

    @Override
    public String toString() {
        return "Name: " + this.first_name + " " + this.last_name
                + "\nNumber of points: " + this.number;
    }
/*

     private final String firstName;
     private final String lastName;
     private final int indexNumber;
     private final String date_of_birth;

    public Student(String firstName, String lastName, int indexNumber, String date_of_birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        this.date_of_birth = date_of_birth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.indexNumber + " " + this.date_of_birth;
  */

}

