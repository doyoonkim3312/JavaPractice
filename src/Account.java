/*
This class is corresponding to 'ReturnObject.java' class.
 */

public class Account {
    private String bankName;
    private int accountNumber;
    private String accountType;
    private String holderName;
    private double balance;

    public Account (String newBankName, int newAccountNumber, String newAccountType, String newHolderName,
                    double newBalance) {

        bankName = newBankName;
        accountNumber = newAccountNumber;
        accountType = newAccountType;
        holderName = newHolderName;
        balance = newBalance;
    }

    public String getBankName() {
        return bankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBankName(String usrBankName) {
        bankName = usrBankName;
    }

    public void setAccountNumber(int usrAccountNumber) {
        accountNumber = usrAccountNumber;
    }

    public void setAccountType(String usrAccountType) {
        accountType = usrAccountType;
    }

    public void setHolderName(String usrHolderName) {
        holderName = usrHolderName;
    }

    public void withdrawal(double amount) {
        balance = balance - amount;
        System.out.println("TRANSACTION COMPLETE: Current Balance: " + balance);
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("TRANSACTION COMPLETE: Current Balance: " + balance);
    }

}
