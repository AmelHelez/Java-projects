package ba.edu.ssst;

public class IndustryBuilding extends Building{
    private final double area;
    private final int numberOfCompanies;

    public IndustryBuilding(String name,double area, int numberOfCompanies) {
        super(name);
        this.area = area;
        this.numberOfCompanies = numberOfCompanies;
    }

    @Override
    public double getArea() {
        return area;
    }

    public int getNumberOfCompanies() {
        return numberOfCompanies;
    }

    @Override
    public String toString() {
        return this.area + ", " +
                "\nNumber of companies: " + this.numberOfCompanies;
    }
}
