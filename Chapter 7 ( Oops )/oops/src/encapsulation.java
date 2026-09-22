import java.util.Scanner;

class BankAccount {

    // Private data - cannot be accessed directly outside this class
    private final String accountHolder;
    private final String accountNumber;
    private String pin;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, String accountNumber, String pin, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Check PIN
    public boolean checkPin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    // Deposit money
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
            System.out.println("Deposited: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining balance: " + balance);
        }
    }

    // Change PIN
    public void changePin(String oldPin, String newPin) {

        if (!pin.equals(oldPin)) {
            System.out.println("Old PIN is incorrect.");
            return;
        }

        if (newPin.length() != 4) {
            System.out.println("PIN must contain exactly 4 digits.");
            return;
        }

        pin = newPin;
        System.out.println("PIN changed successfully.");
    }

    // Show account information
    public void showAccountDetails() {

        System.out.println();
        System.out.println("----- Account Details -----");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}


public class encapsulation {

        static void main() {

        Scanner sc = new Scanner(System.in);

        // Create account
        BankAccount account = new BankAccount(
                "Ali Hassan",
                "PK001234567",
                "1234",
                1000000
        );

        System.out.println("================================");
        System.out.println("       BANKING SYSTEM");
        System.out.println("================================");

        // Login
        System.out.print("Enter your PIN: ");
        String enteredPin = sc.nextLine();

        if (!account.checkPin(enteredPin)) {
            System.out.println("Incorrect PIN.");
            sc.close();
            return;
        }

        System.out.println("Login successful.");

        int choice;

        do {

            System.out.println();
            System.out.println("--------- MENU ---------");
            System.out.println("1. Account Details");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Change PIN");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    account.showAccountDetails();
                    break;

                case 2:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;

                case 3:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();

                    account.deposit(depositAmount);
                    break;

                case 4:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();

                    account.withdraw(withdrawAmount);
                    break;

                case 5:
                    sc.nextLine();

                    System.out.print("Enter old PIN: ");
                    String oldPin = sc.nextLine();

                    System.out.print("Enter new PIN: ");
                    String newPin = sc.nextLine();

                    account.changePin(oldPin, newPin);
                    break;

                case 6:
                    System.out.println("Thank you for using our banking system.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 6);

        sc.close();
    }
}