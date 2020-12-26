package Interface;

public class SamsungXeon implements RetailItem {
    private String productName;
    private int displaySize;
    private double retailPrice;

    public SamsungXeon() {
        productName = "";
        displaySize = 0;
        retailPrice = 0.0;
    }

    public SamsungXeon(String productName, int displaySize, double retailPrice) {
        this.productName = productName;
        this.displaySize = displaySize;
        this.retailPrice = retailPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    @Override
    public double getRetailPrice() {
        return retailPrice;
    }
}
