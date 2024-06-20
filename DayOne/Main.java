public class Main {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount(100);
        System.out.println("Opening Balance: $" + myAcc.getBalance());
        myAcc.deposit(500);
        System.out.println("New Balance: $" + myAcc.getBalance());
        myAcc.withdraw(200);
        System.out.println("New Balance: $" + myAcc.getBalance());
    }
}
