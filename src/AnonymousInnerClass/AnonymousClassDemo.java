package AnonymousInnerClass;

import java.util.Scanner;

/**
 * Inner Class: Class that is defined inside another class; Anonymous Inner Class: Inner class that has no name.
 * Purpose: For creating a class that is simple, and to be instantiated only once in code.
 * Format: new ClassOrInterfaceName() {
 *              (Field and methods of the anonymous class...)
 *          }
 *
 * Requirement & Restrictions:
 *  1. It must either implement an interface, or extend another class.
 *  2. It must override all of the abstract methods specified by the interface, and superclass.
 *  3. Because its definition is written inside a method, it can access that method's local variable, but only if
 *     they are declared final or effectively final.
 */

public class AnonymousClassDemo {
    public static void main(String[] args) {
        String testString = "Effectively Final Value";
        final String testString2 = "Final Value";

        Scanner usrScanner = new Scanner(System.in);
        System.out.println("Enter the integer");
        int usrNumber = Integer.parseInt(usrScanner.nextLine());
        usrScanner.close();

        // Create an Anonymous inner class that implements IntCalculator.
        IntCalculator squared = new IntCalculator() {
            @Override
            public int Calculate(int number) {
                System.out.println(testString + " " + testString2);
                return number * number;
            }
        };  // Because the codes above is a complete statement, it must end with semicolon.

        // Using normal class to execute same function as code above.
        SquaredCalc squared2 = new SquaredCalc(usrNumber);


        System.out.println("Using Anonymous Inner Class: " + squared.Calculate(usrNumber));
        System.out.println("Using normal class: " + squared2.Calculate(usrNumber));

    }
}
