package AdvancedInheritance;

import java.util.Scanner;

public class PassFailExamDemo {
    public static void main(String[] args) {
        Scanner usrScanner = new Scanner(System.in);
        System.out.println("Enter the number of questions on Test");
        int numQuestions = Integer.parseInt(usrScanner.nextLine());

        System.out.println("Enter the number of question missed");
        int numMissed = Integer.parseInt(usrScanner.nextLine());

        System.out.println("Enter the minimum passing score.");
        double minPassingScore = Double.parseDouble(usrScanner.nextLine());

        PassFailExam testInstance = new PassFailExam(numQuestions, numMissed, minPassingScore);

        System.out.println("TEST INFO PRINT\n" +
                "TOTAL QUESTION ON TEST: " + numQuestions + "\n" +
                "NUMBER OF QUESTION MISSED: " + testInstance.getNumMissed() + "\n" +
                "NUMERIC SCORE: " + testInstance.getScore() + "\n" +
                "PASS/FAIL: " +  testInstance.getGrade());
    }
}
