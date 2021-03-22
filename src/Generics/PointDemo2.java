package Generics;

/*
    This class demonstrates instantiating Generic class without specifying type parameter.
    If Generic class is instantiating without type parameter, it will automatically uses raw type for its type parameter,
    which is 'Object'

    This is not recommended way.
 */


public class PointDemo2 {
    public static void main(String[] args) {

        Integer xCoord = 1;
        Double yCoord = 9.2;
        Point testInstance = new Point(xCoord, yCoord);

        System.out.println("X Coordinate: " + testInstance.getX());
        System.out.println("Y Coordinate: " + testInstance.getY());

        int xCoordRetrieved = (int) testInstance.getX();
        double yCoordRetrieved = (double) testInstance.getY();

        System.out.println("X Coordinate Retrieved: " + xCoordRetrieved);
        System.out.println("Y Coordinate Retrieved: " + yCoordRetrieved);

    }
}
