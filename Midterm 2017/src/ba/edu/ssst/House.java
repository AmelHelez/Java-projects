package ba.edu.ssst;

public class House extends Building {
    private final int area;
    private final int company;


    public House(String name,int area,int company) {
        super(name);
        this.area = area;
        this.company = company;
    }

    @Override
    public double getArea() {
        return this.area;
    }
}
