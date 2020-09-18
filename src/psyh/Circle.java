package psyh;

import java.util.Objects;

public class Circle extends Shape {

    private Point a;
    private Point b;
    private double radius;

    public Circle() {
        super();
    }

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
        radius = a.distanceBetweenPoints(b);
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

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.pow((Math.PI * radius), 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(a, circle.a) &&
                Objects.equals(b, circle.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
