class Bank {
    private double balance = 0;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(1000);
        b.withdraw(400);
        b.showBalance();
    }
}
