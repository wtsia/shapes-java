public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public int getSide() {
        return getWidth(); // Since Square is a special case of Rectangle with equal width and height, we can use getWidth().
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