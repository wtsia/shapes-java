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
        return "Rectangle: Width: " + width + "   Height: " + length;
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