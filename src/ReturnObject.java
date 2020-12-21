import javax.swing.*;

public class ReturnObject {
    public static void main(String[] args) {

            Account testAccount = new Account("KB KOOKMIN", 1, "Checking",
                    "DOYOON KIM", 10000.0);

            int transactionOption = transactionDisplay();

             while (true) {
                 if (transactionOption == 0) {
                     Account createdAccount = accountFactory();

                     int optionCode = transactionDisplay();
                     while (true) {
                         if (optionCode == 5) {
                             transactionOption = 5;
                             break;
                         }
                         optionCode = transactions(optionCode, createdAccount);
                     }
                 } else if (transactionOption == 5) {
                     //exitCode = 99999;
                     break;
                 } else {
                     transactionOption = transactions(transactionOption, testAccount);
                 }
        }
    }

    public static int transactionDisplay() {
        String usrInput = JOptionPane.showInputDialog("Choose the servie you want\n" +
                "0: Create New Account\n" +
                "1. Check Account Information\n" +
                "2. Edit Account Information\n" +
                "3. Make a Deposit\n" +
                "4. Withdrawal\n" +
                "5. Exit");

        int transactionOption = Integer.parseInt(usrInput);

        return transactionOption;
    }

    //Returning Object from Methods.
    public static Account accountFactory() {
        String bankName = JOptionPane.showInputDialog("Enter the bank name");
        while (bankName == null) {
            bankName = JOptionPane.showInputDialog("INVALID: Bank name should not be kept empty. Enter the Bank name");
        }
        int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the account number"));
        String accountType = JOptionPane.showInputDialog("Enter Account Type");
        String holderName = JOptionPane.showInputDialog("Enter Holder's name");
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter the balance"));

        return new Account(bankName, accountNumber, accountType, holderName, balance);
    }

    public static int transactions(int optionCode, Account targetAccount) {
        if (optionCode == 1) {
            JOptionPane.showMessageDialog(null, "ACCOUNT INFORMATION\n" +
                    "bank: " + targetAccount.getBankName() + "\n" +
                    "Account No. :" + targetAccount.getAccountNumber() + "\n" +
                    "AccountType: " + targetAccount.getAccountType() + "\n" +
                    "Holder Name: " + targetAccount.getHolderName() + "\n" +
                    "Current Balance: $" + targetAccount.getBalance());

            return transactionDisplay();

        } else if (optionCode == 2) {
            JOptionPane.showMessageDialog(null, "EDIT ACCOUNT INFO");

            return transactionDisplay();

        } else if (optionCode == 3) {
            double depositAmount = Double.parseDouble(JOptionPane.showInputDialog("How much do you" +
                    " want"));
            targetAccount.deposit(depositAmount);

            return transactionDisplay();

        } else if (optionCode == 4) {
            double withdrawalAmount = Double.parseDouble(JOptionPane.showInputDialog("How much do you" +
                    " want"));
            targetAccount.withdrawal(withdrawalAmount);

            return transactionDisplay();

        } else {
            return transactionDisplay();        }
    }
}

