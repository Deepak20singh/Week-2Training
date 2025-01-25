package assistedproblems.employeemanagementsystem;

public class EmployeeMangementSystemCodeMain {
    public static void main(String args[]){
        Employee Manager=new Manager("Dev",25,2345678,25000,5);
        Manager.displayDetails();
        Employee developer=new Developer("Aditya",23,5467867,35000,"java");
        developer.displayDetails();
        Employee intern=new Intern("Pratap",26,8435324,23000,"Problem Solving");
        intern.displayDetails();

    }
}