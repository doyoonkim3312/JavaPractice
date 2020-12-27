package AnonymousInnerClass;

/*
  NOTE: KEEP IN MIND that Lambda expression is a kind of fancy way to create anonymous inner class that implements
        functional interface. Anonymous inner class's characteristics are also applied to Lambda Expression.
 */

public class LambdaDemo2 {
    public static void main(String[] args) {
        int genNumber = 7;
        final int timesThree = 3;   // Final Value

        IntCalculator testInstance = (number) -> number * timesThree;

        System.out.println(testInstance.Calculate(genNumber));

    }
}
