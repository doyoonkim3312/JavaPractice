package AdvancedInheritance;

import Inheritance.GradeActivity;

import javax.swing.JOptionPane;

public class ProtectedDemo {
    public static void main(String[] args) {
        String usrInput = JOptionPane.showInputDialog("Enter the number of questions on Test");
        int numQuestions = Integer.parseInt(usrInput);

        usrInput = JOptionPane.showInputDialog("Enter the number of question that student missed");
        int numMissed = Integer.parseInt(usrInput);

        FinalExam2 testInstance = new FinalExam2(numQuestions, numMissed);

        JOptionPane.showMessageDialog(null, testInstance.printFinalExamInfo());
    }

}
