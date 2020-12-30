package ExceptionHandling;

/*
    Single Catch clause can handle multiple exceptions in order to reduce duplicated codes.
    To do this, | sign is used. This symbol is the same one as OR operator.
 */

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchDemo {
    private static final String path = System.getProperty("user.home");
    public static void main(String[] args) {
        int month = 0;
        double sales;
        double totalSales = 0.0;

        String fileName = JOptionPane.showInputDialog("Enter the name of file.");
        File targetFile = new File(path + "/Desktop/" + fileName + ".txt");

        try {
            Scanner fileScanner = new Scanner(targetFile);

            while (fileScanner.hasNext()) {
                sales = fileScanner.nextDouble();
                totalSales += sales;
                month++;
            }

            JOptionPane.showMessageDialog(null,"SALES REPORT\n" +
                    "TOTAL SALES: " + totalSales + " IN " + month + " MONTHS");

        } catch (FileNotFoundException | InputMismatchException exception) {
            JOptionPane.showMessageDialog(null, "ERROR OCCURRED! SYSTEM WILL CLOSE");
            exception.printStackTrace();
            System.exit(0);
        }

    }
}
