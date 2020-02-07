package ba.edu.ssst;

import java.util.ArrayList;

public class City implements IBuildingInformation {
    private final String name;
    private ArrayList<Building> list;

    public City(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    @Override
    public double getArea() {
        double area = 0;
        for(Building b : list) {
            area += b.getArea();
        }
        return area;
    }

    public void addBuilding(Building b) {
        this.list.add(b);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Building> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "City name: " + this.name +
                " " + this.list;
    }
}
