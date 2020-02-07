package ba.edu.ssst;

public abstract class Building implements IBuildingInformation{
    private final String buildingName;

    public Building(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuildingName() {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
