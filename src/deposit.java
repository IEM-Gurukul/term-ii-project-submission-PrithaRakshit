public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        System.out.println("Deposited");
    }
}