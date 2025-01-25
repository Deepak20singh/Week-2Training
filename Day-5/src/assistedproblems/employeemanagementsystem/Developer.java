package assistedproblems.employeemanagementsystem;

public class Developer  extends Employee{
    private String programmingLanguage;
    public Developer(String name,int age,int id,int salary,String programmingLanguage){
        super(name,age,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    public void displayDetails(){
        System.out.println("Hey jani ,i am Developer");
        System.out.println();

    }
}