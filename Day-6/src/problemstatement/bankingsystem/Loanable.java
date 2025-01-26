package problemstatement.bankingsystem;

public interface Loanable {
    void applyForLoan(double amount);

    double calculateLoanEligibility();
}