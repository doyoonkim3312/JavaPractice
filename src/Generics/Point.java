package Generics;

/*
    A generic class or method is one that permits you to specify the allowable types of objects that the class or method
    may work with. If class or method with an object that is not of an allowable type are attempted to use, an error
    occurs at compile time.

    Java allows to use the diamond operator (<>) to simplify the instantiation of a generic class.

    Java offers several generic classes, such as ArrayList.
 */

/**
 * This class holds X and Y coordinates. The data type of the coordinate is generic.
 */

public class Point<T> {
    /*
        In class header, <> operator with type parameter 'T' is used. (Implies that this class is generic class)

        Type parameter is an identifier that represents an actual type. When class is instantiated, actual type has
        to be used as an argument for the type parameter.

        Commonly Used Type Parameter Names
        1. T: General Type
        2. S: General Type when T has already been used.
        3. E: Type of an element, such as clement in an ArrayList or other collections.
        4. K: Type of a key in a class that keeps key/value pairs.
        5. V: Type of a value in a class that keeps key/value pairs.
     */

    private T xCoordinate;
    private T yCoordinate;

    // Constructor
    public Point(T xCoordinate, T yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    // Setter
    public void setX(T xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setY(T yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    //getter
    public T getX() {
        return xCoordinate;
    }

    public T getY() {
        return yCoordinate;
    }
}
