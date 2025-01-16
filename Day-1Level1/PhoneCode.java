import java.util.Scanner;

public class Phone {
	String brand, model;
	int price;
	
	Phone(String brand,String model,int price){
		this.model=model;
		this.brand=brand;
		this.price=price;
	}
	
	void display(){
		System.out.printf("Name of mobile brand : %s%nName of model :- %s%nPrice of mobile : %d", brand,model, price);
	} 
    }
    
   public class PhoneCode{

    public static void main(String[] args) {
		
		//Program to Handle Mobile Phone Details

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the name of mobile brand : ");
        String brand = sc.nextLine();
         
		System.out.print("Enter the model name of mobile : ");
        String model = sc.nextLine();
		
       
        System.out.print("Enter the price of model : ");
        int price = sc.nextInt();
		
		Phone oppo=new Phone( brand,model,price);
		
		oppo.display();
		}
}
