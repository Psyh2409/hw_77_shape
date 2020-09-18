package psyh;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        Shape square = new Square(new Point(0,0), new Point(0,5));
        System.out.printf("Square has perimeter - %.2f, area - %.2f\n", square.getPerimeter(), square.getArea());
        Shape triangle = new Triangle(new Point(0,0), new Point(0,5), new Point(5,0));
        System.out.printf("Triangle has perimeter - %.2f, area - %.2f\n", triangle.getPerimeter(), triangle.getArea());
        Shape circle = new Circle(new Point(0,0), new Point(0,5));
        System.out.printf("Circle has perimeter - %.2f, area - %.2f\n", circle.getPerimeter(), circle.getArea());

        board.putShape(square);
        board.printInfo();
        board.putShape(triangle);
        board.printInfo();
        board.putShape(circle);
        board.printInfo();
        board.removeShape(square);
        board.printInfo();
        board.removeShape(triangle);
        board.printInfo();
        board.removeShape(circle);
        board.printInfo();
    }
}
