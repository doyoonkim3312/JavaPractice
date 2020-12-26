package Polymorphism;

import AdvancedInheritance.PassFailExam;
import Inheritance.FinalExam;
import Inheritance.GradeActivity;

public class Polymorphic {
    public static void main(String[] args) {
        GradeActivity[] testArray = new GradeActivity[3];

        testArray[0] = new GradeActivity();
        testArray[0].setScore(95);

        testArray[1] = new PassFailExam(20, 5, 60);

        testArray[2] = new FinalExam(50, 7);


        for (int i = 0; i < testArray.length; i++) {
            getTestInfo(testArray[i]);
        }

        /*
        In Java, Inheritance relationship (aka. "Is-a" relationship) does not work in reverse. Likewise, same logic works
        in polymorphism.
         */

        /*
            *'instanceof' Operator: This operator determines whether an object is an instance of a particular class.
            * Example statement: instance_name instanceof class_name --> (returns boolean).
         */

    }

    public static void getTestInfo(GradeActivity instance) {
        System.out.println("Test" + ": " +
                "Score: " + instance.getScore() + ", Grade: " + instance.getGrade() + "\n");
    }

}
