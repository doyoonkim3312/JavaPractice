package Overriding;

public class SuperClassTest3 {

    public void showValue(int arg) {
        System.out.println("SUPERCLASS: The int arg was " + arg);
    }

    //Overload
    public final void showValue(String arg) {
        System.out.println("SUPERCLASS: the String arg was " + arg);
    }
}
