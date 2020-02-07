package ba.edu.ssst;

public class House extends Building {
    private final int area;
    private final int numberOfPeople;

    public House(String name,int area, int numberOfPeople) {
        super(name);
        this.area = area;
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public double getArea() {
        return area;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    @Override
    public String toString() {
        return super.toString() + getArea() + "\nNumber of people: " + this.numberOfPeople;
    }
}
