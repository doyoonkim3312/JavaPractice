package Overriding;

public class SubClassTest3 extends SuperClassTest3 {

    @Override
    public void showValue(int arg) {
        //This method overrides a superclass method.
        System.out.println("SUBCLASS: The int arg was " + arg);
    }

    public void showValue(double arg) {
        //This method overload superclass method.
        System.out.println("SUBCLASS: The double arg was " + arg);
    }
}
