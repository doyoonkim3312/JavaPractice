package Generics;

public class PointDemo3 {
    public static void main(String[] args) {
        Point<Integer> testInstance1 = new Point<>(1,2);
        Point<Double> testInstance2 = new Point<>(1.1, 2.2);
        Point<Long> testInstance3 = new Point<>(10L, 20L);
        Point<Float> testInstance4 = new Point<>(1.2f, 2.3f);
        Point<Object> testInstance5 = new Point<>(1.7, 2.7);

        printEachCoordinates(testInstance1);
        System.out.println();

        printEachCoordinates(testInstance2);
        System.out.println();

        printEachCoordinates(testInstance3);
        System.out.println();

        printEachCoordinates(testInstance4);
        System.out.println();


        printEachPointLowerBound(testInstance1);
        System.out.println();

        // printEachPointLowerBound(testInstance2);     This line causes compile error.
        printEachPointLowerBound(testInstance5);    // Using polymorphism when testInstance5 is declared.

    }

    /*
        Instead of defining its restriction inside of parameter, it can be placed outside of parameter field, especially
        between access modifier and return type, in order to avoid unnecessary redundancy.

        In general, this restriction called "Constraining the type parameter to an upper bound.

            * Before: public static void printEachCoordinate(Point<? extends Number> point)
            * After: public static <T extends Number> void printEachCoordinate(Point<T> point)
     */

    public static <T extends Number> void printEachCoordinates(Point<T> point) {
        System.out.println("X coordinate: " + point.getX());
        System.out.println("Y coordinate: " + point.getY());
    }

    /*
        Constraining the type parameter to an lower bound
            Using super, instead of extends, defines the 'lower bound' of type parameter.

            Ex: public static <T super Integer> void methodName(Point<T> point)
                This method can take Integer, and its superclass type of object as a type parameter. In this case,
                Integer, Number, Object (Object -> Number -> Integer)

             * Note: Type parameter restriction to lower bound using super keyword has to be placed in insdie of
                    type parameter field. (cannot be placed outside of type parameter field)
     */

    public static void printEachPointLowerBound(Point<? super Integer> point) {
        System.out.println("X Coordinate " + point.getX());
        System.out.println("Y Coordinate " + point.getY());
    }
}
