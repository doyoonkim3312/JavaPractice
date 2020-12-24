package Inheritance;
/*
    'super': 'super' keyword refers to an object's superclass. 'super' keyword can be used to call a Superclass constructor.
 */

public class SubClassTest2 extends SuperClassTest2 {

    public SubClassTest2() {

        System.out.println("Subclass no-arg constructor is called");
    }

    public SubClassTest2(int testArg) {
        super(testArg); //Calling specific Superclass constructor that accepts argument.
        System.out.println("Subclass constructor accepts arguments is called");
    }


}
