package Overriding;

import java.util.Scanner;

public class CurvedActivityDemo {
    public static void main(String[] args) {
        Scanner usrScanner = new Scanner(System.in);
        System.out.println("Enter the score student receive");
        double rawScore = Double.parseDouble(usrScanner.nextLine());

        System.out.println("Enter the percentage for curved score");
        double percentage = Double.parseDouble(usrScanner.nextLine());

        CurvedActivity testCurvedActivity = new CurvedActivity(rawScore, percentage);

        System.out.println("GRADE DETAILS\n" +
                "RAW SCORE: " + testCurvedActivity.getRawScore() + "\n" +
                "CURVE PERCENTAGE: " + testCurvedActivity.getPercentage() + "%\n" +
                "CURVED SCORE: " + testCurvedActivity.getScore() + "\n" +
                "LETTER GRADE: " + testCurvedActivity.getGrade());

    }
}
