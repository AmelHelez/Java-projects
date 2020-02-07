package ba.edu.ssst;

import java.util.ArrayList;

public class City {
   private final String name;
   private ArrayList<Building> collection;

   public void addBuilding(ArrayList<Building> collection) {
       collection = new ArrayList<>();
   }
    public City(String name) {
        this.name = name;
    }
}
