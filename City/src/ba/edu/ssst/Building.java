package ba.edu.ssst;

public abstract class Building implements IBuildingInformation {
    private final String name;

    public Building(String name) {
        this.name = name;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return this.name + "\nArea: ";
    }
}
