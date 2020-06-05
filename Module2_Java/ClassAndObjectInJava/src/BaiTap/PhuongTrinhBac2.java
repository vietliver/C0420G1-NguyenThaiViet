package BaiTap;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextFloat();
        System.out.println("Enter b:");
        double b = scanner.nextFloat();
        System.out.println("Enter c:");
        double c = scanner.nextFloat();
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has a double root: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has 2 roots: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getDiscriminant() {
        return this.b*this.b - 4*this.a*this.c;
    }
    public double getRoot1() {
        return (-this.b + Math.pow((this.b*this.b - 4*this.a*this.c),0.5))/(2*this.a);
    }
    public double getRoot2() {
        return (-this.b - Math.pow((this.b*this.b - 4*this.a*this.c),0.5))/(2*this.a);
    }
}