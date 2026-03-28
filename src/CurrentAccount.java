public class CurrentAccount extends Account {
    public CurrentAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        
        if ( balance - amount >= -500) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}
