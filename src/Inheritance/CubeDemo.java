package Inheritance;

import java.util.Scanner;

public class CubeDemo {
    public static void main(String[] args) {
        Scanner usrScanner = new Scanner(System.in);
        System.out.println("Enter the side length of the Cube.");
        double sideLenght = Double.parseDouble(usrScanner.nextLine());

        System.out.println("Enter the length of Rectangular Tank");
        double length = Double.parseDouble(usrScanner.nextLine());

        System.out.println("Enter the width of Rectangular Tank");
        double width = Double.parseDouble(usrScanner.nextLine());

        System.out.println("Enter the height of Rectangular Tank");
        double height = Double.parseDouble(usrScanner.nextLine());

        usrScanner.close();

        Cube testCube = new Cube(sideLenght);

        RectangularTank testRectangularTank = new RectangularTank(length, width, height);

        System.out.println("CUBE INFORMATION\n" +
                "LENGTH, WIDTH, HEIGHT: " + testCube.getLength() + ", " + testCube.getWidth() + ", " + testCube.getHeight() + "\n" +
                "BASE AREA: " + testCube.getArea() + "\n" +
                "SURFACE AREA: " + testCube.getSurfaceArea() + "\n" +
                "VOLUME: " + testCube.getVolume() + "\n");

        System.out.println(testRectangularTank.getArea() + " " + testRectangularTank.getSurfaceArea() + " " + testRectangularTank.getVolume());


        System.exit(0);
    }
}
