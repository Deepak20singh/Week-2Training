package assistedproblems.employeemanagementsystem;

public class Employee {
    private String name;
    private int age;
    private int id,salary;

    Employee(String name,int age,int id,int salary){
        this.name=name;
        this.age=age;
        this.id=id;
        this.salary=salary;
        System.out.println("Name of Employee :- "+name);
        System.out.println("Age of Employee :- "+age);
        System.out.println("id of Employee :- "+id);
        System.out.println("Salary of Employee :- "+salary);

    }
    public void displayDetails(){
        System.out.println("Employee");
    }
}
