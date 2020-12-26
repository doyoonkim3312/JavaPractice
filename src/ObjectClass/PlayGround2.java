package ObjectClass;
/*
    The Java API has a class named 'Object', which all other classes directly or indirectly inherit from.
 */
import AdvancedInheritance.PassFailExam;

public class PlayGround2 {
    public static void main(String[] args) {
        PassFailExam examInstance1 = new PassFailExam(0,0,0.0);
        PassFailExam examInstance2 = new PassFailExam(0,0,0.0);

        System.out.println(examInstance1);
        System.out.println(examInstance2);  //In this line, .toString after examInstance2 is automatically added by Java. Same logic works in code above.
        /*
        .toString method is inherited from Object class. The codes above will print string in this combination below:
            "Object's class name + @ + Object's hashcode" (Hashcode is in hexadecimal.)

            ** Hashcode is a unique number that allocate to object when it's created.
         */

        if(examInstance1.equals(examInstance2)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are not the same");
        }
    }
}
