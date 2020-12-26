package Interface;

import java.util.Scanner;

public class RelatableDemo {
    public static void main(String[] args) {
        Scanner usrScanner = new Scanner(System.in);
        System.out.println("Enter the number of questions on test");
        int numQuestions = Integer.parseInt(usrScanner.nextLine());

        System.out.println("Enter the number of questions student missed");
        int numMissed = Integer.parseInt(usrScanner.nextLine());

        FinalExam3 exam1 = new FinalExam3(numQuestions, numMissed);
        FinalExam3 exam2 = new FinalExam3(100, 30);

        System.out.println("Exam1: " + exam1.getScore() + "\nExam2: " + exam2.getScore());

        //Compare Exam Score
        if (exam1.equals(exam2)) {

            System.out.println("Both has a same score");
        }

        if (exam1.isGreaterThan(exam2)) {
            System.out.println("Exam1's score is greater than exam2's score");
        }

        if (exam1.isLessThan(exam2)){
            System.out.println("Exam1's score is less than exam2's score");
        }
    }
}
