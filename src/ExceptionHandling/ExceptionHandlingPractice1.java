package ExceptionHandling;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.logging.Level;


public class ExceptionHandlingPractice1 {
    public static void main(String[] args) {
        File testFile = new File("MyTestFile.txt");

        try {
            Scanner inputFile = new Scanner(testFile);
        } catch (FileNotFoundException fnfException) {
            System.out.println(fnfException.toString());
        }
    }
}
