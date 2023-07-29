public class Rectangle extends TwoDimensionalShape {
    private int length;
    private int width;

    public Rectangle(int width, int length) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getSmallerSide() {
        if (this.length > this.width) {
            return this.width;
        }
        return this.length;
    }

    public int getBiggerSide() {
        if (this.length > this.width) {
            return this.length;
        }
        return this.width;
    }
    // TODO: Rectangle <= Circle
    public boolean perimeterCanFitInside(TwoDimensionalShape shape) {
        if (shape instanceof Square) {
            Square square = (Square) shape;
            return getSmallerSide() > square.getSide();
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return getSmallerSide() > circle.getRadius()*2.0; 
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            if (getBiggerSide() > rectangle.getBiggerSide() && getSmallerSide() > rectangle.getSmallerSide()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Rectangle: A quadrilateral with four right angles";
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle:\tWidth: " + width + "\tHeight: " + length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) obj;
        return (this.length == other.length && this.width == other.width)
                || (this.length == other.width && this.width == other.length);
    }
}
