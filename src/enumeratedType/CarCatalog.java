package enumeratedType;

public class CarCatalog {
    public static void main(String[] args) {
        Car testCar1 = new Car("Tesla Model 3", CarType.EV, CarMaker.TESLA, CarColor.RED, 49999.99);

        System.out.println(testCar1.printCarInfo());

    }
}
