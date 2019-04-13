package CashPoint;

import java.util.Scanner;

public class CashPoint {
    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        CashPoint open = new CashPoint();
        open.initialScreen();
    }

    private void initialScreen() {
        System.out.println("What is your account number?");
        int account = Integer.parseInt(myScanner.nextLine());
        System.out.println("What is your pin number?");
        int pin = Integer.parseInt(myScanner.nextLine());
        if (account == 1234 && pin == 1223) {
            currAccount();
        } else if (account == 2345 && pin == 2334) {
            jointAccount();
        } else if (account == 3456 && pin == 3344) {
            savingsAccount();
        } else {
            System.out.println("This is not the correct account number/pin number combination");
        }
    }

    private void currAccount() {
        System.out.println("Name: Reginald");
        System.out.println("Address: 104 Pulteney, Bath");
        System.out.println("DOB: 31/12/1966");
        System.out.println("Card number: 12345678");
        int acc = 1234;
        int balance = 5000;
        System.out.println("Account no: " + acc + " Balance: £" + balance);
        action();
    }


    private void jointAccount() {
        System.out.println("Name: Simon + Emma");
        System.out.println("Address: 10 Milsom Street, Bath");
        System.out.println("Card number: 56096756");
        int acc = 2345;
        int balance = 2000;
        System.out.println("Account no: " + acc + " Balance: £" + balance);
        action();
    }

    private void savingsAccount() {
        System.out.println("Name: Terry Tibbs");
        System.out.println("Address: 77 Queen Street, Bath");
        System.out.println("DOB: 14/07/1996");
        System.out.println("Card number: 12345678");
        int acc = 3456;
        int balance = 10000;
        System.out.println("Account no: " + acc + " Balance: £" + balance);
        action();
    }

    private void transferFunds() {
        System.out.println("What account do you want to transfer from?\n (Options: Current Account, Joint Account, Savings Account)");
        String input = myScanner.nextLine();
        if (input.equalsIgnoreCase("Current")) {
            System.out.println("Which account would you like to transfer too?");
            String sourceAcc = myScanner.nextLine();
            System.out.println("How much would you like to transfer?");
            String transferAmt = myScanner.nextLine():
            if (sourceAcc.equalsIgnoreCase("Current")) {

            }
        } else if (input.equalsIgnoreCase("Joint")) {
            System.out.println("How much would you like to transfer?");
        } else if (input.equalsIgnoreCase("Savings")) {
            System.out.println("How much would you like to transfer?");
        }
        String transfer = myScanner.nextLine();

        double amount = Double.parseDouble(myScanner.nextLine());
        if (transfer.equalsIgnoreCase("Joint Account")) {
            if (srcAcc.equalsIgnoreCase("savings")) {

            }
        }
        if (transfer.equalsIgnoreCase("Current")) {
            //Transfer money from current account to Joint account
        } else if (transfer.equalsIgnoreCase("Savings Account")) {
            //Transfer money from curr account to savings account
        }
    }

    private void deposit() {
        System.out.println("Which account would you like to make a deposit to?");
        String account = myScanner.nextLine();
        System.out.println("How much would you like to deposit?");
        short depositAmount = Short.parseShort(myScanner.nextLine());
        if (account.equalsIgnoreCase("Current")) {
            cAccountBalance += depositAmount;
        } else if (account.equalsIgnoreCase("Joint")) {
            jAccountBalance += depositAmount;
        } else if (account.equalsIgnoreCase("Savings")) {
            sAccountBalance += depositAmount;
        } else {
            System.out.println("Invalid account option provided");
        }
    }

    private void withdraw() {
        System.out.println("Which account would you like to make a withdrawal from?");
        String account = myScanner.nextLine();
        System.out.println("How much would you like to withdraw?");
        short withDrawAmount = Short.parseShort(myScanner.nextLine());
    }

    private void logOut() {
        System.out.println("Logging off");
        initialScreen();
    }

    private void action() {
        System.out.println("What do you want to do next?\n (Options: Transfer funds, Deposit, Withdraw, Log Out)");
        String input = myScanner.nextLine();
        if (input.equalsIgnoreCase("Transfer funds")) {
            transferFunds();
        } else if (input.equalsIgnoreCase("Deposit")) {
            deposit();
        } else if (input.equalsIgnoreCase("Withdraw")) {
            withdraw();
        } else if (input.equalsIgnoreCase("logout")) {
            logOut();
        }
    }

}
