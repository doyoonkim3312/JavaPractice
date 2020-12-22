import java.util.*;

public class StockManager {
    public static void main(String[] args) {
        Scanner usrInput = new Scanner(System.in);

        System.out.println("Enter the Symbol");
        String usrSymbol = usrInput.nextLine();

        System.out.println("Enter the Share Price");
        double usrSharePrice = Double.parseDouble(usrInput.nextLine());

        Stock testStockInstance = new Stock(usrSymbol, usrSharePrice);
        Stock testStockInstance2 = new Stock("XYZ", 9.62);

        //System.out.println(testStockInstance); // --> corresponding to public String toString() method in Stock.java

        System.out.println("Symbol is " + testStockInstance.getSymbol());
        System.out.println("SharePrice is " + toString(testStockInstance.getSharePrice()));

        if (testStockInstance.equals(testStockInstance2)) {
            System.out.println("Both contain same values");
        } else {
            System.out.println("They contain different values.");
        }

    }

    private static String toString(int usrInput) {
        return Integer.toString(usrInput);
    }

    private static String toString(double usrInput) {
        return Double.toString(usrInput);
    }
}
