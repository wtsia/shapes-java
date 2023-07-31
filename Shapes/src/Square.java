public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public int getSide() {
        return getWidth(); // Since Square is a special case of Rectangle with equal width and height, we can use getWidth().
    }

    public boolean perimeterCanFitInside(TwoDimensionalShape shape) {
        if (shape instanceof Square) {
            Square square = (Square) shape;
            return getSide() > square.getSide();
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return getSide() > circle.getRadius() * 2.0; 
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            double squareMaxLength = (rectangle.getBiggerSide() + rectangle.getSmallerSide())/Math.sqrt(2);
            return getSide() < squareMaxLength;
        }
        return false;
    }

    @Override
    public String getDescription() {
        System.out.println(super.getDescription());
        return "Square: A quadrilateral with four equal sides and four equal angles";
    }

    @Override
    public String toString() {
        return "Square\tSide Length: " + getSide();
    }
}