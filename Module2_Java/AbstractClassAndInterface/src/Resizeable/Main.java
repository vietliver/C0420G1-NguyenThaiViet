package Resizeable;

import CacDoiTuongHinhHoc.Circle;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle();
        circles[1] = new Circle(2.0);
        System.out.println("Before:");
        System.out.println(circles[0].toString());
        System.out.println(circles[1].toString());
        for (Circle i:circles) {
            double x = Math.random()*100;
            i.resize(x);
            System.out.println(i.toString());
        }
    }
}
