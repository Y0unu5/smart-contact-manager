package liskov;
// Square class inherits from Rectangle
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);  // A square has equal width and height
    }

    // Override setWidth and setHeight to maintain square property
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setHeight(double side) {
        super.setHeight(side);
        super.setWidth(side);
    }
}
