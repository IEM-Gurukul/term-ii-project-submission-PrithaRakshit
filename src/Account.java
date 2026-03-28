public class Account {
    public int id;
    public double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
}
public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        System.out.println("Deposited");
    }
}