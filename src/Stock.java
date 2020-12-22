
public class Stock {
    private String symbol;
    private double sharePrice;

    //Constructor
    public Stock(String newSymbol, double newSharePrice) {
        symbol = newSymbol;
        sharePrice = newSharePrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getSharePrice() {
        return sharePrice;
    }


    public static String toString(int usrInput) {
        return Integer.toString(usrInput);
    }

    public static String toString(double usrInput) {
        return Double.toString(usrInput);
    }


    public String toString() {
        return "Symbol: " + symbol + "\n" +
                "Share Price: " + sharePrice;
    }

    public boolean equals(Stock targetInstance) {
        if (symbol.equals(targetInstance.symbol) && sharePrice == targetInstance.sharePrice) {
            return true;
        } else {
            return false;
        }

        /*
        Code above can be shortened as below:
        'return symbol.equals(targetInstance.symbol) && sharePrice == targetInstance.sharePrice;'
         */
    }

}
