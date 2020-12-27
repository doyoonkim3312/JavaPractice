package AnonymousInnerClass;

import java.util.Scanner;

public class LambdaDemo {
    public static void main(String[] args) {
        Scanner usrScanner = new Scanner(System.in);
        System.out.println("Enter the Integer");
        int usrNumber = Integer.parseInt(usrScanner.nextLine());
        usrScanner.close();

        /* Create object that implements the IntCalculator Interface using Lambda Expression
           Because IntCalculator is a functional interface (Has only one abstract method), Lambda expression automatically
           corresponds to that method. In this case, int Calculate(int number) method.)
         */
        IntCalculator squared = number -> number * number;
        /*
            Lambda Expression: Lambda Expression provides a way to easily create and instantiate anonymous inner class.
            General Format: parameter -> expression
            Because IntCalculator is an Functional interface, defining a class that implements the interface is unnecessary.
            Also, do not have to use an anonymous inner class either.
         */

        System.out.println("Result of Lambda Expression: " + squared.Calculate(usrNumber));
    }
}
