package Colorable;

import CacDoiTuongHinhHoc.Circle;
import CacDoiTuongHinhHoc.Rectangle;
import CacDoiTuongHinhHoc.Shape;
import CacDoiTuongHinhHoc.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1,"red",true);
        Rectangle rectangle = new Rectangle(2,3,"blue", true);
        Square square = new Square(4,"white",true);
        Shape[] shapes = {circle,rectangle,square};
        for (Shape i: shapes){
            if (i instanceof Square){
                ((Square) i).howToColor();;
            }
        }
    }
}
