package ba.edu.ssst;

public class Trianglee extends GeometricShape {
    private final int a;
    private final int b;
    private final int c;

    public Trianglee(String color,int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public String getType() {
        return "Triangle";
    }

    @Override
    public double getCircumference() {
        return a+b+c;
    }

    @Override
    public double getArea() {
        double S = (a+b+c) / 2.0;
        return Math.sqrt(S*(S-a)*(S-b)*(S-c));
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide a: " + this.a
                + "\nSide b: " + this.b
                + "\nSide c: " + this.c;
    }
}
