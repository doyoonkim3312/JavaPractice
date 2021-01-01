package ArrayFundamental;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class SimpleArrayDemo2 {
    private static final String homePath = System.getProperty("user.home");

    public static void main(String[] args) {
        double[] salesValues;
        String fileName = JOptionPane.showInputDialog("Enter the file name");

        Scanner fileScanner = openFile(homePath + "/Desktop/" + fileName + ".txt");


        if (fileScanner == null) {
            JOptionPane.showMessageDialog(null, "SYSTEM WILL BE CLOSED");
            System.exit(1010);
        }

        salesValues = new double[getSize(fileScanner)];
        System.out.println(salesValues.length);

        fileScanner = openFile(homePath + "/Desktop/" + fileName + ".txt");

        int index = 0;

        while (fileScanner.hasNext()) {
            try {
                salesValues[index] = fileScanner.nextDouble();
                index++;
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

        for (int j = 0; j < salesValues.length; j++) {
            System.out.println("This: " + salesValues[j]);
        }

    }

    public static Scanner openFile(String fileName) {
        try {
            File targetFile = new File(fileName);
            return new Scanner(targetFile);
        } catch (Exception e) {
            // FileNotFoundException might possibly be occurred.
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
            return null;
        }
    }

    public static int getSize(Scanner targetScanner) {
        int size = 0;

        while (targetScanner.hasNext()) {
            try {
                Double.parseDouble(targetScanner.nextLine());
                size++;
            } catch (NumberFormatException nfe) {
                System.out.println(nfe.toString());
            }
        }
        targetScanner.reset();
        return size;
    }
}
