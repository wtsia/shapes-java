public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public int getSide() {
        return getWidth(); // Since Square is a special case of Rectangle with equal width and height, we can use getWidth().
    }

    public boolean canFitInside(TwoDimensionalShape shape) {
        if (shape instanceof Square) {
            Square square = (Square) shape;
            return getSmaller() > square.getSide();
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return getSmaller() > circle.getRadius()*2.0; 
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            if (getBigger() > rectangle.getBigger() && getSmaller() > rectangle.getSmaller()) {
                return true;
            }
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