package ba.edu.ssst;

public class Rectangle extends GeometricShape {
    private final int a;
    private final int b;

    public Rectangle(String color, int a, int b) {
        super(color);
        if(a <= 0 || b <= 0) throw new IllegalArgumentException("Wrong rectangle inputs.");
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getCircumference() {
        return 2*a + 2*b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide a: " + this.a
                + "\nSide b: " + this.b;
    }
}
