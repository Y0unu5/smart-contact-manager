package liskov;
// A method that prints the area of any shape
public class ShapeAreaCalculator {

    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.area());
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(5);

        printArea(rectangle);  // Outputs: Area: 50.0
        printArea(square);     // Outputs: Area: 25.0
    }
}
