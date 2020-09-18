package psyh;

import java.util.Objects;

public class Square extends Shape{

    Point a;
    Point b;

    public Square() {super();}

    public Square(Point a, Point b) {
        this.a = a;
        this.b = b;
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
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public double getPerimeter() {
        return (a.distanceBetweenPoints(b))*4;
    }

    @Override
    public double getArea() {
        return Math.pow((a.distanceBetweenPoints(b)), 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Objects.equals(a, square.a) &&
                Objects.equals(b, square.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
