public void withdraw(double amount) {
    if (amount <= balance) {
        balance -= amount;
    } else {
        System.out.println("Insufficient funds");
    }
}