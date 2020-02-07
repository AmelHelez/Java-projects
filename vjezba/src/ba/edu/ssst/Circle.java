package ba.edu.ssst;

public class Circle extends GeometricShape {
    private final double radius;
    private double PI = 3.14159;

    public Circle(String color, double radius) {
        super(color);
        if(radius <= 0) throw new IllegalArgumentException("Radius should be > 0!");
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double getCircumference() {
        return 2*PI * radius;
    }

    @Override
    public double getArea() {
        return radius*radius*PI;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + this.radius;
    }
}
