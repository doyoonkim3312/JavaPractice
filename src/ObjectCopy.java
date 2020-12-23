import java.util.*;

public class ObjectCopy {
    public static void main(String[] args) {

        Stock instance1 = new Stock("XYZ", 9.62);
        Stock instance2 = instance1;    //instance2 is an 'reference copy' of instance1.
        Stock instance3 = Stock.copy(instance1);
        Stock instance4 = new Stock(instance3);
        /*
        Reference Copy is a method of copying object by copying it's address.
         */

        System.out.println(instance1.toString());
        System.out.println(instance2.toString());
        System.out.println(instance3.toString());

        if (instance1 == instance3) {
            System.out.println("They reference the same object");
        } else {
            System.out.println("They reference different objects.");
        }

        if (instance1.equals(instance2)) {
            System.out.println("They hold the same value");
        } else {
            System.out.println("They hold different value.");
        }
    }
}
