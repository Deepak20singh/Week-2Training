package hierarchicalinheritance.bankaccounttypes;

public class SavingsAccount extends BankAccount {
    private double interestRate; // Annual interest rate in percentage

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateAnnualInterest() {
        double interest = balance * (interestRate / 100);
        System.out.println("Annual Interest Rate :- $" + interest);
    }

    @Override
    public void displayBalance() {
        super.displayBalance();
        System.out.println("Account Type :- Savings Account");
        System.out.println("Interest Rate :- " + interestRate + "%");
    }
}
