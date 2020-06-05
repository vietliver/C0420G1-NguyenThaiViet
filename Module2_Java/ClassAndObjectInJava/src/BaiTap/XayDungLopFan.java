package BaiTap;

public class XayDungLopFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1 status: " + "\n" + fan1.toString());
        System.out.println();
        System.out.println("Fan 2 status: " + "\n" + fan2.toString());
    }
}

class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return this.on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.getOn()) {
            return "Fan is on" + "\n" + "Speed: " + this.getSpeed() + "\t" + "Color: " + this.getColor() + "\t" + "Radius: " + this.getRadius();
        } else {
            return "Fan is off" + "\n" + "Color: " + this.getColor() + "\t" + "Radius: " + this.getRadius();
        }
//        return super.toString();
    }
}
