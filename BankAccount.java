public class BankAccount {
    private int accountId;
    private String name;
    private double balance;

    public BankAccount(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void printReceipt() {
        System.out.println("Account id: " + accountId);
        System.out.println("Name: " + name);
        System.out.println("Account Balance: Rs." + balance);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Create Account A and Account B
        BankAccount accountA = new BankAccount(12344, "Account A", 5000);
        BankAccount accountB = new BankAccount(12345, "Account B", 2500);

        // Transfer 1500 from Account A to B
        accountA.withdraw(1500);
        accountB.deposit(1500);
        System.out.println("Transfer from Account A to B completed.");
        accountA.printReceipt();
        accountB.printReceipt();

        // Transfer 3000 from Account B to A
        accountB.withdraw(3000);
        accountA.deposit(3000);
        System.out.println("Transfer from Account B to A completed.");
        accountA.printReceipt();
        accountB.printReceipt();
    }
}