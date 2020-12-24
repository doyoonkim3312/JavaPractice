package Overriding;
/*
    Overload vs. Override
        Overload: Same name, different parameter.
        Override: Same name, Same parameter.
    When a subclass overloads a superclass method, both methods may be called with a subclass object. However,
    when a subclass overrides a superclass method, only the subclass's version of the method can be called with a
    subclass object.

    To prevent (unintentional) overriding, use "final" keyword as a modifier.
 */

public class ShowValueDemo {
    public static void main(String[] args) {
        SubClassTest3 testInstance = new SubClassTest3();

        testInstance.showValue(10);
        testInstance.showValue(1.2);
        testInstance.showValue("Hello");
    }
}
