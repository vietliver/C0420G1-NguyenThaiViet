package BaiTap;

class Circle {
    private double radius = 1.0;
    private String color = "red";
    final double PI = 3.14;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return PI*this.radius*this.radius;
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}