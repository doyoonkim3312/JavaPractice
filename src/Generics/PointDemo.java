package Generics;

// This class corresponds with Point class

import java.util.ArrayList;

public class PointDemo {
    public static void main(String[] arg) {

        // Only reference type can be pass to the Generic Class's type parameter. Primitive value has to be wrapped up in a
        // wrapper class before passing to the Generic Class's type parameter

        // Point class with Integer type
        Integer xInt = 10;
        Integer yInt = 20;
        Point<Integer> instance1 = new Point<>(xInt, yInt);

        Point<Integer> instance3 = new Point<>(30,40);      // Using Java's Autoboxing
        // Using Java's Unboxing to store Point values to primitive type variables.
        int xCoordInt = instance3.getX();
        int yCoordInt = instance3.getY();

        // Point class with Double type
        Double xDouble = 3.5;
        Double yDouble = 9.4;
        Point<Double> instance2 = new Point<>(xDouble, yDouble);

        Point<Double> instance4 = new Point<>(4.9, 2.9);    // Using Java's Autoboxing
        // Using Java's Unboxing to store Point values to primitive type variables
        double xCoordDouble = instance4.getX();
        double yCoordDouble = instance4.getY();


        System.out.println("POINT CLASS with INTEGER type");
        System.out.println(instance1.getX());
        System.out.println(instance1.getY());

        System.out.println("POINT CLASS with DOUBLE type");
        System.out.println(instance2.getX());
        System.out.println(instance2.getY());

    }
}
