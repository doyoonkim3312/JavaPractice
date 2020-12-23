
public class Stock {
    private String symbol;
    private double sharePrice;

    //Constructor
    public Stock(String newSymbol, double newSharePrice) {
        symbol = newSymbol;
        sharePrice = newSharePrice;
    }

    //Copy Constructor
    public Stock(Stock targetObject) {
        symbol = targetObject.symbol;
        sharePrice = targetObject.sharePrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public String toString() {
        return "Symbol: " + symbol + "\n" +
                "Share Price: " + sharePrice;
    }

    public boolean equals(Stock targetInstance) {
        if (!symbol.equals(targetInstance.symbol) && sharePrice != targetInstance.sharePrice) {
            return false;
        } else {
            return true;
        }

        /*
        Code above can be shortened as below:
        'return symbol.equals(targetInstance.symbol) && sharePrice == targetInstance.sharePrice;'
         */
    }

    public static Stock copy(Stock targetObject) {
        return new Stock(targetObject.symbol, targetObject.sharePrice);
    }

}
