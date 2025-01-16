import java.util.Scanner;

public class Inventory {
	String  itemCode, itemName;
	int price,quantity;
	
	Inventory(String itemName,String itemCode,int price,int quantity){
		this.itemCode=itemCode;
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
	}
	
	void display(){
		System.out.printf("Name of item : %s%ncode of item is :- %s%nprice of the item is : %d",itemName,itemCode, price*quantity);
	} 
    }
    
   public class InventoryCode{

    public static void main(String[] args) {
		
		//Program to Track Inventory of Items

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the name of item : ");
        String itemName = sc.nextLine();
         
		System.out.print("Enter the code of item : ");
        String itemCode = sc.nextLine();
		
       
        System.out.print("Enter the price of item: ");
        int price = sc.nextInt();
		System.out.print("Enter the number of item: ");
        int quantity = sc.nextInt();
		
		Inventory vr=new Inventory(itemName,itemCode,price,quantity);
		
		vr.display();
		}
}
