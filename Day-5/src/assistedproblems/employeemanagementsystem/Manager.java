package assistedproblems.employeemanagementsystem;

public class Manager extends Employee{
    private int teamSize;

    public Manager(String name,int age,int id,int salary,int teamSize){
        super(name,age,id,salary);
        this.teamSize=teamSize;
    }
    public void displayDetails(){
        System.out.println("Hey bro, Manager here");
        System.out.println();

    }
}