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
        double area = 0;
        System.out.print("On the board ");
        for (Shape shape : shapes) {
            if (shape != null) {
                System.out.print(shape + ", ");
                area += shape.getArea();
            }
        }
        System.out.printf(" with a total area %.2f\n", area);
    }
}
