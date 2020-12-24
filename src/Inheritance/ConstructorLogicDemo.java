package Inheritance;
/*
    For constructor, the Superclass constructor is always executed before the Subclass constructor.
 */

public class ConstructorLogicDemo {
    public static void main(String[] args) {

        SubClassTest testInstance = new SubClassTest();
        System.out.println();

        SubClassTest2 testInstance2 = new SubClassTest2();
        System.out.println();

        SubClassTest2 testInstance3 = new SubClassTest2(10);
        System.out.println();
    }
}
