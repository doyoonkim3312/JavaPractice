package AnonymousInnerClass;

/*
    This class correspond to LambdaExpressions interface.
 */

public class LambdaExpressionPractice {
    public static void main(String[] args) {
        final int testNum = 7;
        final int testNum2 = 3;

        /* Lambda Expressions that do not return a value.
        LambdaExpressions expressionTest1 = (int num) -> System.out.println("Declared Integer is " + num);
        expressionTest1.method1(testNum);
         */

        /* Lambda Expression with Multiple Parameters.
        LambdaExpressions expressionTest2 = (int num1, int num2) -> num1 + num2;
        System.out.println("Addition: " + expressionTest2.method2(testNum, testNum2));
         */

        /* Lambda Expression with No Parameters.
        LambdaExpressions expressionTest3 = () -> System.out.println("Hello, Java!");
        expressionTest3.printGreeting();
         */

        LambdaExpressions expressionTest4 = (number) -> {
            int three = 3;
            return number * 3;
        };
        System.out.println(expressionTest4.timesThree(testNum2));
    }
}
