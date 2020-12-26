package Interface;

import java.util.Scanner;

/*
    Why we use Interface although there's an Abstract Class:
    A: Both Abstract Class and Interface have similar functionality, however, class can only extend ONE superclass, and
    class can implement numbers of Interface.
 */

public class InterfaceDemo {
    public static void main(String[] args) {
        Scanner usrScanner = new Scanner(System.in);
        System.out.println("Enter the Language Name");
        String languageName = usrScanner.nextLine();

        Language testLanguage = new Language(languageName);

        testLanguage.Display();
        System.out.println("\n" + testLanguage.returnString());
    }
}
