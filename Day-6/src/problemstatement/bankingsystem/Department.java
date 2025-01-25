package problemstatement.bankingsystem;

public interface Department {
   default void assignDepartment(String department){
       getDepartmentDetails(department);
    };//by default sb public he hote hai
    default void getDepartmentDetails(String deparment){
        System.out.println("Assigned Department :- "+deparment);// you can provide a default implementation that can be inherited by implementing classes.
    };

}
