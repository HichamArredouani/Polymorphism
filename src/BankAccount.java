public class BankAccount {
    private String accountNumber;
    private double balance;
    private double amount;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void depost (double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

        public void withdraw (double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }

        }
    }



