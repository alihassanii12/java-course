abstract class Bank {

    // Abstract methods
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract void checkBalance();
}


class MeezanBank extends Bank {

    private double balance;

    // Constructor
    MeezanBank(double balance) {
        this.balance = balance;
    }

    @Override
    void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            IO.println("Deposit successful.");
            IO.println("Deposited: $" + amount);
        } else {
            IO.println("Invalid deposit amount.");
        }
    }

    @Override
    void withdraw(double amount) {

        if (amount <= 0) {
            IO.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            IO.println("Insufficient balance.");
        } else {
            balance -= amount;
            IO.println("Withdrawal successful.");
            IO.println("Withdrawn: $" + amount);
        }
    }

    @Override
    void checkBalance() {
        IO.println("Current Balance: $" + balance);
    }
}
