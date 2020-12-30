package ExceptionHandling;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/*
    When certain method throws exception, it must be handled.

    Types of Exception:
        1. Unchecked Exception: This type of exceptions are NOT recommended to be handled. All exceptions inherits from
                                either the Error class or RuntimeException class. Because, exceptions inherit from Error class
                                cause critical error (like Out-of-memory error), and exceptions inherit from RuntimeException class
                                are the one caused by programming miss (can be prevented)

        2. Checked Exception: This type of exceptions SHOULD BE handled. All exceptions not inherits from Error class or RuntimeException class.
                              if certain method potentially throw a checked exceptions, that method must meet one of following requirements:

                              a. It must handle the exception
                              b. It must have a 'throws' clause listed in the method header.
 */


public class ExceptionHandlingPractice1 {
    public static void main(String[] args) {
        File testFile = new File("MyTestFile.txt");

        try {
            Scanner inputFile = new Scanner(testFile);
        } catch (Exception fnfException) {
            fnfException = new Exception("ERROR! EXCEPTION OCCURRED! ");
            System.out.println(fnfException.getMessage());
            //System.out.println(fnfException.toString());
        }
    }
}
