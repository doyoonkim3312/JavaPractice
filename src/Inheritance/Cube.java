package Inheritance;

public class Cube extends Rectangle {
    private double height;

    // No-arg constructor for default value.
    public Cube () {
        super();
        height = 0;
    }

    public Cube(double sideLenght) {
        super(sideLenght, sideLenght);   //Superclass constructor must execute before subclass constructor.
        this.height = sideLenght;
    }

    public Cube(Cube targetInstance) {
        super(targetInstance.getLength(), targetInstance.getWidth());
        this.height = targetInstance.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getSurfaceArea() {
        return super.getArea() * 6;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}

