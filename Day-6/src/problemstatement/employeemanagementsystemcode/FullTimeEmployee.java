package problemstatement.employeemanagementsystemcode;

public class FullTimeEmployee extends Employee implements Department{
    private int timing;
    private String department;
    private String typeOfEmployment="Full Time job";
    FullTimeEmployee(int employeeId,int baseSalary,String name,int timing){
        super(employeeId,baseSalary,name);
        this.timing=timing;

    }
    public int calculateSalary(){
        return timing*super.calculateSalary();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("The salary of employer :- " + calculateSalary());
        System.out.println("Type of Employment :-" + typeOfEmployment);
     }
    @Override
    public void assignDepartment(String department) {
        Department.super.assignDepartment(department);
        this.department=department;
    }


    public void getDepartmentDetails() {
        Department.super.getDepartmentDetails(department);
    }
}
