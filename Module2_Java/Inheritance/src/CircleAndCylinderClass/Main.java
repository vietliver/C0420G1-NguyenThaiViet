package CircleAndCylinderClass;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0,"blue");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(2.0,"yellow",1.0);
        System.out.println(cylinder.toString());
    }
}
