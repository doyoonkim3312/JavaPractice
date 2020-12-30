package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingPractice2 {
    public static void main (String[] args) {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Enter any integer please!");

        // When multiple catch clauses exist for multiple exception handling, catch clause that handles more specialized exception
        // should be placed before one that handles more generalized exception. (Refers Hierarchy tree of exception classes)
        try {
            int usrInt = Integer.parseInt(userScanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.exit(0);
    }
}
