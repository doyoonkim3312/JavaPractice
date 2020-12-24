package Inheritance;

public class Rectangle {
    private double length;
    private double width;

    //no-arg constructor for default value.
    public Rectangle() {
        length = 0.0;
        width = 0.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle targetInstance) {
        this.length = targetInstance.length;
        this.width = targetInstance.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }
}
