package hierarchicalinheritance.bankaccounttypes;

public class BankAccountManagementSystemMain {
    public static void main(String[] args) {
        // Savings Account
        SavingsAccount savingsAccount = new SavingsAccount("ACC0293832", 10000, 5);
        System.out.println("Savings Account Details");
        savingsAccount.displayBalance();
        savingsAccount.calculateAnnualInterest();
        System.out.println();

        // Checking Account
        CheckingAccount checkingAccount = new CheckingAccount("ACC0985670", 5000, 1000);
        System.out.println("Checking Account Details");
        checkingAccount.displayBalance();
        checkingAccount.withdraw(1200); // Exceeds limit
        checkingAccount.withdraw(800);  // Valid withdrawal
        System.out.println();

        // Fixed Deposit Account
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD11223", 20000, 5, 25000);
        System.out.println("Fixed Deposit Account Details");
        fixedDepositAccount.displayBalance();
    }
}
