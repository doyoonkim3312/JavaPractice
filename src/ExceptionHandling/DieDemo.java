package ExceptionHandling;

import java.util.Scanner;

public class DieDemo {
    public static void main(String[] args) {
        Scanner usrScanner = new Scanner(System.in);
        System.out.println("Enter the number of sides");

        Die sampleDie = new Die(usrScanner.nextInt());
        usrScanner.close();

        sampleDie.roll();
        System.out.println(sampleDie.getDieValue());
    }
}
