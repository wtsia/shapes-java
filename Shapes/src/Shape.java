public abstract class Shape {
    public abstract String getDescription();

    public abstract double getArea();
}

public interface PerimeterCalculable {
    double getPerimeter();
}

public interface VolumeCalculable {
    double getVolume();
}


