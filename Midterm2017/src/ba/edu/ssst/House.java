package ba.edu.ssst;

public class House extends Building {
   private final double area;
   private final int numberOfPeople;

    public House(String name,double area, int numberOfPeople) {
        super(name);
        this.area = area;
        this.numberOfPeople = numberOfPeople;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return this.area + "\nNumber of people: "
                + this.numberOfPeople;
    }
}
