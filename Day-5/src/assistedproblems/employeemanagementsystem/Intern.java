package assistedproblems.employeemanagementsystem;

public class Intern extends Employee{
    private String skill;
    public Intern(String name,int age,int id,int salary,String skill){
        super(name,age,id,salary);
        this.skill=skill;
    }

    public void displayDetails(){
        System.out.println("Hey bro, i am new  ");
        System.out.println();
    }
}