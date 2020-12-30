package ExceptionHandling;

// Example of Effective Exception Handling

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class SalesReport2 {
    private static final String homeDirectory = System.getProperty("user.home");
    public static void main(String[] args) {
        int months = 0;
        double sales;
        double totalSales = 0.0;

        String fileName = JOptionPane.showInputDialog("Enter the name of the file");
        File targetFile = new File(homeDirectory + "/Desktop/" + fileName + ".txt");

        Scanner fileScanner = readFile(targetFile);

        if (fileScanner == null) {
            System.exit(2);
        }
        while (fileScanner.hasNext()) {
            try {
                sales = fileScanner.nextDouble();
                totalSales += sales;
                months++;
            } catch (Exception e) {
                // InputMismatchException will possibly occurred.

                JOptionPane.showMessageDialog(null, "Invalid value detected: Skipped this value");

                // Skipped invalid value
                fileScanner.nextLine();
            }
        }
        fileScanner.close();
        double averageSales = totalSales / months;

        JOptionPane.showMessageDialog(null, "SALES SUMMARY\n" +
                "TOTAL SALES: " + totalSales + " IN " + months + " MONTHS\n" +
                "AVERAGE SALES: " + averageSales);

        System.exit(0);

    }

    public static Scanner readFile(File file) {
        try {
            return new Scanner(file);
        } catch (Exception e) {

            // FileNotFoundException will possibly occurred.
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
}
