package ExceptionHandling;/*
This class is corresponding to 'ExceptionHandling.AccountDemo.java' class.
Also corresponding to 'NegativeStartingBalanceException' class.
 */

import ExceptionHandling.NegativeStartingBalanceException;

public class Account {
    private String bankName;
    private int accountNumber;
    private String accountType;
    private String holderName;
    private double balance;

    /**
     * This is a recommended constructor.
     * @param newBankName Name of Bank
     * @param newAccountNumber Account Number
     * @param newAccountType Type of Account (either Checking or Saving)
     * @param newHolderName Name of account holder
     * @param newBalance initial balance.
     * @exception NegativeStartingBalanceException This exception will thrown when initial balance is negative.
     */
    public Account (String newBankName, int newAccountNumber, String newAccountType, String newHolderName,
                    double newBalance) throws NegativeStartingBalanceException {

        if (newBalance < 0.0) {
            throw new NegativeStartingBalanceException(newBalance);
            // since NegativeStartingBalanceException is checked exception (inherits from Exception class), method must
            // notify compiler that NegativeStartingBalanceException might be occurred using throws keyword.
        }

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
