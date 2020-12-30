package ExceptionHandling;

import java.io.IOException;

public class ParseIntError {
    public static void main(String[] args) {
        String testString = "test string";

        try {
            // This line possibly throws NumberFormatException.
            int parseInt = Integer.parseInt(testString);
        } catch (Exception e) {
            // Polymorphism also works in Exception handling. Since try block throws an exception that is an object,
            // polymorphic declaration works in catch block.
            System.out.println("Conversion Error: " + e.toString());
        }
    }
}
