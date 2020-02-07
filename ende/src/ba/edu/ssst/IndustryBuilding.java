package ba.edu.ssst;

public class IndustryBuilding extends Building {
    private final double area;
    private final int number_of_comp;

    public IndustryBuilding(String name, double area, int number_of_comp) {
        super(name);
        this.area = area;
        this.number_of_comp = number_of_comp;
    }

    public int getNumber_of_comp() {
        return number_of_comp;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return super.getName() + "\nArea: " + this.area +
                "\nNumber of companies: " + this.number_of_comp;
    }
}
