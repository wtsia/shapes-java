public class Cylinder extends ThreeDimensionalShape {
    private Circle topBottom;
    private int height;

    public Cylinder(Circle topBottom, int height) {
        this.topBottom = topBottom;
        this.height = height;
    }

    public Circle getTopBottom() {
        return topBottom;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String getDescription() {
        return "Cylinder: A solid geometric figure with straight parallel sides and a circular or oval cross section";
    }

    @Override
    public double getArea() {
        double circleArea = 2 * topBottom.getArea();
        double lateralArea = 2 * Math.PI * topBottom.getRadius() * height;
        return circleArea + lateralArea;
    }

    @Override
    public double getVolume() {
        return topBottom.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder\tRadius: " + topBottom.getRadius() + "\tHeight: " + height;
    }

    public boolean canBeTopOrBottomOfCylinder(Circle circle) {
        return topBottom.equals(circle);
    }
}