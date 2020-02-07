package ba.edu.ssst;

import java.util.ArrayList;

public class Movie implements Ratable {
    private String title;
    private ArrayList<String> listOfActors;

    public Movie(String title) {
        this.title = title;
        this.listOfActors = new ArrayList<>();
    }

    public ArrayList<String> getListOfActors() {
        return listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void setListOfActors(ArrayList<String> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void addActors(String actors) {
        this.listOfActors.add(actors);
    }

    @Override
    public int getRating() {
        return 0;
    }

    @Override
    public void setRating(int rating) {

    }

    @Override
    public String getRatingStars() {
        return null;
    }

    @Override
    public void setRange(int num1, int num2) {

    }
}
