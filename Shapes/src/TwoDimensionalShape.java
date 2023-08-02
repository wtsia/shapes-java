public abstract class TwoDimensionalShape extends Shape implements PerimeterCalculable {
    public abstract double getPerimeter();

    public boolean perimeterCanFitInside(TwoDimensionalShape shape) {
        if (shape instanceof Square) {
            Square sq = (Square) shape;
            return getPerimeter() > sq.getPerimeter();
        } else if (shape instanceof Circle) {
            Circle cir = (Circle) shape;
            return getPerimeter() > cir.getPerimeter();
        } else if (shape instanceof Rectangle) {
            Rectangle rect = (Rectangle) shape;
            return getPerimeter() > rect.getPerimeter();
        }
        return false;
    }
}