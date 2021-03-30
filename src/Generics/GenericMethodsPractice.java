package Generics;

public class GenericMethodsPractice {
    public static void main(String[] args) {
        Point<Integer> testInstance1 = new Point<>(1,2);
        Point<Double> testInstance2 = new Point<>(1.1, 2.2);

        printPoints(testInstance1);
        printPoints(testInstance2);

        printPointsRecommended(testInstance1);
        printPointsRecommended(testInstance2);

        // Demonstration
        Point<String> errorInstance = new Point<>("1", "2");
        printPoints(errorInstance); // This method accept 'all' value (technically no restriction)
        // printPointsRecommended(errorInstance);  // This method accept all value 'only if' those value extends Number.
                                                // Compile Error occurred this time.
    }

    /*
        A '?', called Type Wildcard, is used to make method that accepts any type of valid value: most fundamental characteristic
        of Generic Methods.
        Type wildcard indicates that any type argument can be used in its place.

        Potential Problem: Type wildcard might not be restrictive enough.
     */
    public static void printPoints(Point<?> point) {
        System.out.println("X coordinate: " + point.getX());
        System.out.println("Y coordinate: " + point.getY());
    }

    /*
        In this case, all possible type of Point object are extended from Number (java.lang) class, so it should be better
        indicating this limitation for proper restriction. To do this, 'extend 'class' followed by type wildcard is used.

        Now, this method below accept any type of valid value only if those value extends Number class. (Integer, Double
        Short, Long, Float)
     */
    public static void printPointsRecommended(Point<? extends Number> point) {
        System.out.println("X Coordinate: " + point.getX());
        System.out.println("Y Coordinate: " + point.getY());
    }
}
