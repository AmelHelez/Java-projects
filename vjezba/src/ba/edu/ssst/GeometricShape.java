package ba.edu.ssst;

public abstract class GeometricShape {
    private final String color;

    protected GeometricShape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract String getType();

    public abstract double getCircumference();
    public abstract double getArea();

    @Override
    public String toString() {
        return "Color: " + this.color +
                "\nCircumference: " + getCircumference()
                + "\nArea: " + getArea();
    }
}
