package task_2;

class Account {

    private double balance;

    // No-argument constructor
    public Account() {
        balance = 0.0;
    }

    // Parameterized constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test
    public static void main(String[] args) {

        // Using no-argument constructor
        Account acc1 = new Account();
        acc1.deposit(5000);
        acc1.withdraw(2000);
        acc1.displayBalance();

        System.out.println("------------");

        // Using parameterized constructor
        Account acc2 = new Account(10000);
        acc2.withdraw(3000);
        acc2.displayBalance();
    }
}

