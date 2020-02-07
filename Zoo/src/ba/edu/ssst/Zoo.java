package ba.edu.ssst;

import java.util.ArrayList;

public class Zoo {
    private final String name;
    private final String location;
    private final double fee;
    ArrayList<Animal> list;

    public Zoo(String name, String location, double fee) {
        this.name = name;
        this.location = location;
        this.fee = fee;
        list = new ArrayList<>();
    }

    public void deleteAnimal(Animal e) {
        list.remove(e);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getFee() {
        return fee;
    }


}
