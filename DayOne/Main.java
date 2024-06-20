public class Main {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount(12000);
        System.out.println("Current Balance: " + myAcc.getBalance());
        myAcc.deposit(3000);
        System.out.println("Current Balance: " + myAcc.getBalance());
        myAcc.withdraw(5000);
        System.out.println("Current Balance: " + myAcc.getBalance());
    }
}
