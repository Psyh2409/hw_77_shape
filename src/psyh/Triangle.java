package psyh;

import java.util.Objects;

public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
        super();
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(a, triangle.a) &&
                Objects.equals(b, triangle.b) &&
                Objects.equals(c, triangle.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public double getPerimeter() {
        return a.distanceBetweenPoints(b) + b.distanceBetweenPoints(c) + c.distanceBetweenPoints(a);
    }

    @Override
    public double getArea() {
        double ab = (a.distanceBetweenPoints(b));
        double bc = (b.distanceBetweenPoints(c));
        double ca = (c.distanceBetweenPoints(a));
        return Math.sqrt((ab + bc + ca) * (bc + ca - ab) * (ab + ca - bc) * (ab + bc - ca)) / 4;
    }
}
