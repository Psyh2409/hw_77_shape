package psyh;

import java.util.Arrays;

public class Board {
    private Shape[] shapes;

    public Board() {
        super();
        shapes = new Shape[4];
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    public String toString() {
        return "Board{" +
                "shapes=" + Arrays.toString(shapes) +
                '}';
    }

    public void putShape(Shape shape){
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) {
                shapes[i] = shape;
                break;
            }
        }
    }

    public void removeShape(Shape shape){
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) continue;
            if (shapes[i].equals(shape)) {
                shapes[i] = null;
            }
        }
    }

    public void printInfo(){
        System.out.print("On the board ");
        for (Shape shape : shapes) if (shape != null) System.out.print(shape + ", ");
        System.out.printf("the total area is %.2f\n", getTotalArea());
    }

    public double getTotalArea(){
        double area = 0;
        for (Shape shape : shapes) {
            if (shape != null) {
                area += shape.getArea();
            }
        }
        return area;
    }
}
