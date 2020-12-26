package Polymorphism;

import AdvancedInheritance.PassFailActivity;
import AdvancedInheritance.PassFailExam;
import Inheritance.FinalExam;
import Inheritance.GradeActivity;

/*
    *Polymorphism: Ability to make many forms.
    In Java, a reference variable is polymorphic because it can reference objects of types different from its owm, as
    long as those types are subclasses of its type.
 */

public class PlayGround3 {
    public static void main(String[] args) {
        GradeActivity testInstance1;
        GradeActivity testInstance2;

        testInstance1 = new GradeActivity(90);
        testInstance2 = new FinalExam(100, 5);
        /*
        GradeActivity is a Superclass of FinalExam. Because of this relationship, testInstance2 variable (data type: GradeActivity)
        can refer a FinalExam Object. (KEEP IN MIND that testInstance2 variable can refer FinalExam object but its data type is still
        GradeActivity)
         */

        //Example of Polymorphic reference variables.
        GradeActivity polymorphismTest1 = new FinalExam(50, 5);
        GradeActivity polymorphismTest2 = new PassFailActivity(70);
        GradeActivity polymorphismTest3 = new PassFailExam(100, 10, 60);
        /*
         All three statements above are perfectly legal, because the FinalExam, PassFailActivity, PassFailExam classes
         inherits from GradeActivity.
         */

        /*
        NOTE: Polymorphic reference variables can be used to call methods only its data type class has, regardless of
        the type of object the variable references.
         */
        GradeActivity testInstance4 = new PassFailExam(100, 10, 60);
        System.out.println(testInstance4.getScore());
        System.out.println(testInstance4.getGrade());
        /*
            In case of code above [System.out.println(testInstance4.getGrade())], Java Virtual Machine performs Dynamic
            binding, or Late binding when the code is executed. It's because testInstance4 contains polymorphic reference.
            This means, when method called has two version (original, overridden), JVM determine which method to call, depending
            on the type of object. (not type of variable.)
         */

    }
}
