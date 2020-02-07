package ba.edu.ssst;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class City {
    private final String name;
    private ArrayList<Building> buildings;

    public City(String name) {
        this.name = name;
        this.buildings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void addBuilding(Building b) {
        this.buildings.add(b);
    }

    @Override
    public String toString() {
        return "City name: " + this.name + "\nBuildings: " + this.buildings;
    }

}
