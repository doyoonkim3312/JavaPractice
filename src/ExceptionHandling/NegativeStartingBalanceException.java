package ExceptionHandling;

public class NegativeStartingBalanceException extends Exception {

    public NegativeStartingBalanceException() {
        super("Negative starting balance is not acceptable for initial balance");
    }

    public NegativeStartingBalanceException(double balance) {
        super("Negative starting balance is not acceptable for initial balance: " + balance);
    }
}
