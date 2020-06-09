package CircleAndCylinderClass;

public class Circle {
    protected double radius;
    protected String color;
    protected final double PI = 3.14;
    protected double area;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius*this.radius*PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", PI=" + PI +
                ", area=" + this.getArea() +
                '}';
    }
}
