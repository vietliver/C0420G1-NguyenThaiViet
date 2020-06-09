package CircleAndCylinderClass;

public class Cylinder extends Circle {
    private double height;
    private double volume;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume() {
        return height*super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", PI=" + PI +
                ", volume=" + this.getVolume() +
                '}' ;
    }
}
