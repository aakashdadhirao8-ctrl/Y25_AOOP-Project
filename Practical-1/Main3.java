//Create a BankAccount class with account number and balance. Implement deposit and withdrawal methods.
class BankAccount {
    int accountNumber;
    double balance;
    
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("Depositing $" + amount);
        balance += amount;
    }

    public void withdrawal(double amount) {
        System.out.println("Withdrawing $" + amount);
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("-----------------------");
    }
}
public class Main3 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12345, 1000.00);
        BankAccount account2 = new BankAccount(67890, 500.00);

        account1.deposit(200.00);
        account1.withdrawal(150.00);
        account1.displayDetails();

        account2.deposit(300.00);
        account2.withdrawal(800.00);
        account2.displayDetails();
    }
}
