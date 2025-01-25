package hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount {
    private int depositTerm; // Deposit term in years
    private double maturityAmount; // Total amount after term ends

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm, double maturityAmount) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
        this.maturityAmount = maturityAmount;
    }

    @Override
    public void displayBalance() {
        super.displayBalance();
        System.out.println("Account Type :- Fixed Deposit Account");
        System.out.println("Deposit Term :- " + depositTerm + " years");
        System.out.println("Maturity Amount :- $" + maturityAmount);
    }
}
