package ba.edu.ssst;

import java.util.ArrayList;

public class Zoo {
    private final String name;
    private final String city;
    private final double fee;

    private ArrayList<Animal> list = new ArrayList<>();

    public Zoo(String name, String city, double fee) {
        this.name = name;
        this.city = city;
        this.fee = fee;
    }
}
