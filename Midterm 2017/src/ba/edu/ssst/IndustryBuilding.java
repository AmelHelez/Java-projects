package ba.edu.ssst;

public class IndustryBuilding extends Building {
    private final int area;
    private final int company;

    public IndustryBuilding(String buildingName,int area,int company) {
        super(buildingName);
        this.area = area;
        this.company = company;
    }

    @Override
    public double getArea() {
        return this.area;
    }
}
