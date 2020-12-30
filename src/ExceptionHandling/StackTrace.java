package ExceptionHandling;

/*
    Call stack: Call stack is an internal list of all the methods that are currently executing. It indicates the method
    was executing when an exception occurred and all of the methods that were called in order to execute that method.

    When an exception thrown, it must be handled. However, if there are no such codes handle exception, JVM follows call stack
    to find exception handler. If JVM couldn't find exception handler until it reaches 'main' method, the control of program
    is passed to default exception handler.
 */

public class StackTrace {
    public static void main(String[] args) {

        System.out.println("Calling myMethod...");
        myMethod();
        System.out.println("Main is done.");

    }

    public static void myMethod() {
            System.out.println("Calling produceError...");
            produceError();
            System.out.println("myMethod is Done");
    }

    public static void produceError() {
        String sampleString = "Java";
        try {
            System.out.println(sampleString.charAt(4));
        } catch (IndexOutOfBoundsException iobe) {
            iobe.printStackTrace(); // All exception has printStackTrace() method inherits from Throwable class.)
        }
    }
}

