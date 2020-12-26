package Interface;
/*
    Interface specifies behavior for a class. Interface is like a class that contains only abstract methods.
    Interface cannot be instantiated, but can be implemented by other classes. When class implements interface, the class
    must override the methods that are specified by the interface.
 */
public interface Displayable {
    void Display();
    String returnString();
    /*
        Methods in Interface have to be publicly accessible. Thus, All methods are automatically treated as Public.
        That's why there's no access modifier at method.
     */


    default void display() {
        System.out.println("This is default method.");
    }
    /*
        Default Method: Interface may have Default Method. Default method is an Interface method that has a body.
        Class implements this Interface can override this Default method, but is not required to.

        One major benefit of having Default methods is that they allow to add new methods to an existing interface
        without causing errors in the classes that already implement the interface.
     */

}
