package enumeratedType;

import java.util.UUID;

public class Car {
    private UUID identifyNumber;
    private String carName;
    private CarType carType;
    private CarMaker carMaker;
    private CarColor carColor;
    private double price;

    //Constructor
    public Car (String carName, CarType carType, CarMaker carMaker, CarColor carColor, double price) {
        identifyNumber = UUID.randomUUID(); //Generating random identifier number.
        this.carName = carName;
        this.carType = carType;
        this.carMaker = carMaker;
        this.carColor = carColor;
        this.price = price;
    }

    //Copy constructor
    public Car(Car targetInstance) {
        this.identifyNumber = targetInstance.identifyNumber;
        this.carName = targetInstance.carName;
        this.carType = targetInstance.carType;
        this.carMaker = targetInstance.carMaker;
        this.carColor = targetInstance.carColor;
        this.price = targetInstance.price;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setCarMaker(CarMaker carMaker) {
        this.carMaker = carMaker;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIdentifyNumber() {
        return identifyNumber.toString();
    }

    public String getCarName() {
        return carName;
    }

    public CarType getCarType() {
        return carType;
    }

    public CarMaker getCarMaker() {
        return carMaker;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public double getPrice() {
        return price;
    }

    public String printCarInfo() {
        return "CAR INFORMATION\n" +
                "ID: " + identifyNumber + "\n" +
                "Model: " + carName + "\n" +
                "Type: " + carType + "\n" +
                "Maker: " + carMaker + "\n" +
                "Color: " + carColor + "\n" +
                "Price: " + price;
    }
}
