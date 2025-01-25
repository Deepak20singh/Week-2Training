package hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount {
    private double withdrawalLimit; // Daily withdrawal limit

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal amount more then daily limit of $" + withdrawalLimit);
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public void displayBalance() {
        super.displayBalance();
        System.out.println("Account Type :- Checking Account");
        System.out.println("Daily Withdrawal Limit :- $" + withdrawalLimit);
    }
}