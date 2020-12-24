package Inheritance;
/*
    Inheritance is simply make a "is a" relationship between classes (aka Superclass, Subclass)
    When Subclass inherits a Superclass, all public members of Superclass become a public member of Subclass.
    Inheritance dose not work in reverse, which means, Superclass cannot access subclass's public methods.
 */

import javax.swing.*;
public class GradeDemo {
    public static void main(String[] args) {
        String usrInput = JOptionPane.showInputDialog("How many questions were on a final exam?");
        int numQuestions = Integer.parseInt(usrInput);

        usrInput = JOptionPane.showInputDialog("How many questions did student miss?");
        int numMissed = Integer.parseInt(usrInput);

        FinalExam testFinalExam = new FinalExam(numQuestions, numMissed);

        JOptionPane.showMessageDialog(null, testFinalExam.printExamInfo());

        System.exit(0);

    }
}
