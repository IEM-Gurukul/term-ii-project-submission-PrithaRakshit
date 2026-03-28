public class SavingsAccount extends Account {
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public void addInterest() {
        balance += balance * 0.05;
    }
}