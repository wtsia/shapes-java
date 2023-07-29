public class Circle extends TwoDimensionalShape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean canFitInside(TwoDimensionalShape shape) {
        if (shape instanceof Square) {
            Square square = (Square) shape;
            double sideSquare = (double) square.getSide();
            return getRadius()*2.0 > Math.sqrt(2*sideSquare*sideSquare);
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return getRadius() > circle.getRadius(); 
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            double smallSide = (double) rectangle.getSmaller();
            double bigSide = (double) rectangle.getBigger();
            
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Circle: A closed plane curve every point of which is equidistant from a fixed point within the curve";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle\tRadius: " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;
        Circle other = (Circle) obj;
        return this.radius == other.radius;
    }
}