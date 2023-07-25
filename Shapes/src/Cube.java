public class Cube extends ThreeDimensionalShape {
    private Square face;

    public Cube(Square face) {
        this.face = face;
    }

    public Square getFace() {
        return face;
    }

    @Override
    public String getDescription() {
        return "Cube: A three-dimensional solid object bounded by six square faces with three meeting at each vertex";
    }

    @Override
    public double getArea() {
        return 6 * face.getArea();
    }

    @Override
    public double getVolume() {
        return Math.pow(face.getSide(), 3);
    }

    @Override
    public String toString() {
        return getDescription() + " Side Length: " + face.getSide();
    }

    public boolean hasSameFace(Square square) {
        return face.equals(square);
    }

    public boolean canFitInside(TwoDimensionalShape shape) {
        if (shape instanceof Square) {
            Square square = (Square) shape;
            return face.getSide() <= square.getSide();
        }
        return false;
    }
}