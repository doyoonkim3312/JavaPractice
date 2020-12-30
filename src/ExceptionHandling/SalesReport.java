package ExceptionHandling;

/*
    Multiple Exception Handling
    Codes in try block, in many case, will be capable of throwing more than one type of exception. To handle multiple
    exceptions, numbers of catch block corresponding to each exception need to be created.
 */

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SalesReport {
    public static void main(String[] args) {
        String fileName = JOptionPane.showInputDialog("Enter the name of the file");
        File targetFile = new File(System.getProperty("user.home") + "/Desktop/" + fileName + ".txt");

        double sales;
        double totalSales = 0;
        int month = 0;

        // Since FileNotFoundException and InputMismatchException all inherit from Exception class,
        // Polymorphic variable type Exception can be used to shorten the code.
        // Two lines will shorten to catch (Exception e) {}

        try {
            Scanner fileScanner = new Scanner(targetFile);
            while (fileScanner.hasNext()) {
                sales = fileScanner.nextDouble();
                totalSales += sales;
                month++;
            }

            JOptionPane.showMessageDialog(null, "SALES INFORMATION\n" +
                    "TOTAL SALES: " + totalSales  + " IN " + month + "MONTHS");

        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, fnfe.toString());
        } catch (InputMismatchException ime) {
            JOptionPane.showMessageDialog(null, ime.toString());
        }

        System.exit(0);

    }
}
