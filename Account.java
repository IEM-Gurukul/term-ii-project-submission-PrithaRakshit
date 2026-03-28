class Account {
    private int id;
    protected double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void display() {
        System.out.println("ID: " + id + " Balance: " + balance);
    }
}