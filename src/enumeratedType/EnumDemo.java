package enumeratedType;

public class EnumDemo {
    public static void main(String[] args) {
        Day workDay = Day.WEDNESDAY;
        System.out.println(workDay);

        System.out.println("Ordinal value for " + Day.SUNDAY + " is " + Day.SUNDAY.ordinal());
        // output will be 0

        System.out.println("Ordinal value for " + Day.SATURDAY + " is " + Day.SATURDAY.ordinal());
        // output will be 6

    }
}
