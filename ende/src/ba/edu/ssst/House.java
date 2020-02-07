package ba.edu.ssst;

public class House extends Building {
    private final double area;
    private final int num_of_ppl;

    public House(String name, double area, int num_of_ppl) {
        super(name);
        this.area = area;
        this.num_of_ppl = num_of_ppl;
    }

    @Override
    public double getArea() {
        return area;
    }

    public int getNum_of_ppl() {
        return num_of_ppl;
    }

    @Override
    public String toString() {
        return super.getName() + "\nArea: " + this.area +
                "\nNumber of people: " + this.num_of_ppl;
    }
}
