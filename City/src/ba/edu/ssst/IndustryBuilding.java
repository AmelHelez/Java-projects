package ba.edu.ssst;

public class IndustryBuilding extends Building {
    private final int area;
    private final int numOfCompanies;

    public IndustryBuilding(String name,int area, int numOfCompanies) {
        super(name);
        this.area = area;
        this.numOfCompanies = numOfCompanies;
    }

    @Override
    public double getArea() {
        return area;
    }

    public int getNumOfCompanies() {
        return numOfCompanies;
    }

    @Override
    public String toString() {
        return super.toString() + getArea() + "\nNumber of companies: " + this.numOfCompanies;
    }
}
