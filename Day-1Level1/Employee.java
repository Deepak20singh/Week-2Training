import java.util.Scanner;

public class Employer {
	String name;
	int id;
	int salary;
	
	Employer(String name,int id,int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	void display(){
		System.out.printf("Name: %s, id: %d, salary: %d%n",name,id,salary);
	} 
    }
    
   public class Employee{

    public static void main(String[] args) {
		
		//Program to Display Employee Details

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a name: ");
        String input = sc.nextLine();
         
		System.out.print("Enter a id: ");
        int id = sc.nextInt();
 
        System.out.print("Enter a salary: ");
        int sal = sc.nextInt();
		
		Employer vr=new Employer(input,id,sal);
		
		vr.display();
		}
}
