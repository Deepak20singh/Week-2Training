package problemstatement.bankingsystem;

public class BankingSystemMain {
    public static void main(String[] args) {
        Employee emp=new FullTimeEmployee(582300,230000,"Dev",8);
        emp.displayDetails();
        ((FullTimeEmployee)emp).assignDepartment("Accounts");

        Employee empP=new PartTimeEmployee(582300,230000,"Dev",4);
        empP.displayDetails();
        ((PartTimeEmployee)empP).assignDepartment("Intern");


    }
}
