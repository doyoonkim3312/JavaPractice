package Inheritance;

public class RectangularTank extends Rectangle {
    private double height;

    public RectangularTank() {
        super();
        height = 0.0;
    }

    public RectangularTank(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public RectangularTank(RectangularTank targetInstance) {
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
        double length = super.getLength();
        double width = super.getWidth();

        return 2 * (height * (length + width) + super.getArea());

    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
