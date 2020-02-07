package ba.edu.ssst;

public abstract class Building implements IBuildingInformation {
    private final String name;

    public Building(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
