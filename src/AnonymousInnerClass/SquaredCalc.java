package AnonymousInnerClass;

public class SquaredCalc implements IntCalculator {
    private int usrNumber;

    public SquaredCalc(int usrNumber) {
        this.usrNumber = usrNumber;
    }

    @Override
    public int Calculate(int number) {
        return number * number;
    }
}
