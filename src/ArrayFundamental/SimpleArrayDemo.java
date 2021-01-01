package ArrayFundamental;

import javax.swing.*;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class SimpleArrayDemo {

    private static final String homePath = System.getProperty("user.home");

    public static void main(String[] args) {
        ArrayList<String> salesValues = new ArrayList<String>();

        String fileName = JOptionPane.showInputDialog("Enter the name of file.");

        Scanner fileScanner = openFile(homePath + "/Desktop/" + fileName + ".txt");

        if (fileScanner == null) {
            JOptionPane.showMessageDialog(null,"System will be closed.");
            System.exit(10);
        }

        String testString;
        while (fileScanner.hasNext()) {
            testString = fileScanner.nextLine();
            if (isNumber(testString)) {
                salesValues.add(testString);
            } else {
                JOptionPane.showMessageDialog(null, "INVALID VALUE DETECTED. \n" +
                        "VALUE WILL BE SKIPPED");
                fileScanner.nextLine();
            }
        }

        for (int i = 0; i < salesValues.size(); i++) {
            System.out.println("Value " + (i + 1) + ": " + salesValues.get(i));
        }

        System.exit(0);
    }

    public static Scanner openFile(String filePath) {
        try {
            File targetFile = new File(filePath);
            return new Scanner(targetFile);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
            return null;
        }
    }

    public static boolean isNumber(String target) {
        try {
            Double.parseDouble(target);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
