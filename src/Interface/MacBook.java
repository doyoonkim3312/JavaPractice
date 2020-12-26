package Interface;

public class MacBook implements RetailItem {
    private String productName;
    private String year;
    private double retailPrice;

    public MacBook() {
        productName = "";
        year = "";
        retailPrice = 0.0;
    }

    public MacBook(String productName, String year, double retailPrice) {
        this.productName = productName;
        this.year = year;
        this.retailPrice = retailPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getYear() {
        return year;
    }

    @Override
    public double getRetailPrice() {
        return retailPrice;
    }
}
