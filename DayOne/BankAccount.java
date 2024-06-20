public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        System.out.println("Depositing $" + amount);
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Withdrawing $" + amount);
            this.balance -= amount;
        }
    }
}
