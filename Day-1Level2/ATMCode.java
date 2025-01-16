import java.util.*;

class ATM {
    //attributes for account holder, account number, and balance
    String accountHolder; 
	String accountNumber;
	double balance;
	
	// Constructor to initialize the info                        //  public ATM
	ATM(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
		this.accountNumber = accountNumber; 
		this.balance = balance;
	}

    // Method to deposit money into the account 
	
    void deposit(double amount) 
	{
        if (amount > 0) 
		{
            balance += amount;
            System.out.println("Deposited: " + amount + ". Current balance: " + balance);
        } 
		else 
		{
            System.out.println("Invalid Amount");
        }
    }

    // Method to withdraw money from the account (only if sufficient balance exists) 
	
    void withdraw(double amount) 
	{
        if (amount > 0) 
		{
            if (balance >= amount) 
			{
                balance -= amount;
                System.out.println("Withdrawn: " + amount + ". Current balance: " + balance);
            } 
			else 
			{
                System.out.println("Insufficient balance. Current balance: " + balance);
            }
        } 
		else 
		{
            System.out.println("Invalid Amount");
        }
    }

    // Method to display the current balance 
	
    public void displayBalance() 
	{
        System.out.println("Current balance: " + balance);
    }
}

// Main class 
public class ATMCode {

    // Main method to test the ATM class
    public static void main(String[] args) { 
	
        // Creating a new ATM object 
		
        ATM account = new ATM("Cena", "12345678", 1000);

        // Performing operations on the account
        account.displayBalance();
        account.deposit(500);
        account.withdraw(300); 
		
        account.withdraw(1500); // Example of insufficient balance
        account.displayBalance();
    }
}

	
	



    