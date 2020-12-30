package ExceptionHandling;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Finally: Finally block is one or more statements that are always executed after the try block has executed and after
 any catch blocks have executed if an exception was thrown.
 The statements in the finally block execute whether an exception occurs or not.
 */
public class FinallyKeywordDemo {
    private static final String path = System.getProperty("user.home");

    public static void main(String[] args) {
        String fileName = JOptionPane.showInputDialog("Enter the name of file");
        File targetFile = new File(path + "/Desktop/" + fileName + ".txt");

        Scanner fileScanner = openFile(targetFile);
        if (fileScanner == null) {
            JOptionPane.showMessageDialog(null, "File not found");
            System.exit(2);
        }

        try {
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextDouble());
            }
        } catch (Exception e) {
            // InputMismatchException will possibly occur.
            System.out.println("INVALID VALUE DETECTED: " + e.toString());
            fileScanner.nextLine();
        } finally {
            fileScanner.close();
            System.out.println("Finally Clause is executed");
        }

        System.exit(0);

    }

    public static Scanner openFile(File file) {
        try {
            return new Scanner(file);
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "FILE NOT FOUND");
            return null;
        }
    }

}
