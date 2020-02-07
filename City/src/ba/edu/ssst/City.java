package ba.edu.ssst;

import java.util.ArrayList;

public class City implements IBuildingInformation{
    private final String name;
    private ArrayList<Building> buildings;

    public City(String name) {
        this.name = name;
        this.buildings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBuilding(Building b) {
        this.buildings.add(b);
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "City name: " + this.name;
    }
}
