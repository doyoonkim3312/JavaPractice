package AnonymousInnerClass;

/**
 * IntCalculator interface has a only one abstract method. This kind of Interface can be considered as "Functional Interface"
 * Functional Interface: Interface that has only one abstract method.
 * Characteristic: To create an object that implements a functional interface, a special type of expression called "Lambda expression"
 * can be used. (Check LambdaDemo.java to see how it works.)
 */

public interface IntCalculator {

    int Calculate(int number);

}
