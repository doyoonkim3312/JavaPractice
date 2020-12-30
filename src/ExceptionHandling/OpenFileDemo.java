package ExceptionHandling;

import javax.swing.JOptionPane;
import java.io.File;
import java.util.Scanner;

public class OpenFileDemo {
    public static void main(String[] args) {
        String path = System.getProperty("user.home");  //Get user's home directory
        String usrFileName = JOptionPane.showInputDialog("Enter the name of the file");
        File usrFile = new File(path + "/Desktop/" + usrFileName + ".txt");

        try {
            Scanner inputFile = new Scanner(usrFile);
            JOptionPane.showMessageDialog(null, "File is found");

        } catch (Exception e) {
            // Try block would possibly throw FileNotFoundException.a
            JOptionPane.showMessageDialog(null, e.toString() + "\n Exit System");
            // System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "Done!");
    }
}
