package Interface;

public class PolymorphicInterfaceDemo {
    public static void main(String[] args) {
        /*
            When a class implements interface, an inheritance relationship known as interface inheritance is established.
            Because of this inheritance relationship, polymorphism in interface works
         */

        MacBook item1 = new MacBook("MBP16", "2019", 3599.00);
        RetailItem item2 = new SamsungXeon("Xeon", 13, 2800.00);

        System.out.println("PRODUCT RETAIL INFO\n" +
                "PRODUCT NAME: " + item1.getProductName() + "\n" +
                "YEAR: " + item1.getYear() + "\n" +
                "RETAIL PRICE: " + printRetialPrice(item1));

        System.out.println("PRODUCT RETAIL INFO\n" +
                "PRODUCT NAME: " + ((SamsungXeon) item2).getProductName() + "\n" +
                "DISPLAY SIZE: " + ((SamsungXeon) item2).getDisplaySize() + "\n" +
                "RETAIL PRICE: " + printRetialPrice(item2));
        /* It is possible to cast an interface reference variable to the type of the object it references.
           But it looks like idiot.
         */
    }

    /*
        Limitation of Interface reference variable:
            * Instance of an interface cannot be created.
            * When interface variable references an object, interface variable can be used to call only the methods that
            are specified in the interface.
     */

    public static double printRetialPrice(RetailItem item) {
        return item.getRetailPrice();
    }

}
