package ba.edu.ssst;

import java.lang.*;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if(a <= 0 || b <= 0 || c <= 0) throw new IllegalArgumentException("Sides have to be > 0!");
        if(a + b <= c || b + c <= a || a + c <= b) throw new IllegalArgumentException("Wrong triangle.");
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getCircumferene() {
        return a+b+c;
    }

    public double getArea() {
        double S = (a+b+c) / 2;
        return Math.sqrt(S*(S-a)*(S-b)*(S-c));
    }

    public Boolean isRightAngled() {
        return Math.sqrt(a) == Math.sqrt(b+c) || Math.sqrt(b) == Math.sqrt(a+c)
                || Math.sqrt(c) == Math.sqrt(a+b);
    }

    public void Scale(double factor) {
        if(factor <= 0) throw new IllegalArgumentException("The factor must be > 0");
        a *= factor;  b *= factor; c *= factor;
    }

    @Override
    public String toString() {
        return "Side a: " + this.a + "\nSide b: "
                + this.b + "\nSide c: " + this.c
                + "\nCircumference: " + getCircumferene()
                + "\nArea: " + getArea() + "\nIs right angled: "
                + (isRightAngled() ? " it is!" : "no..");
    }
}
