import java.util.ArrayList;


class Customer{
	private String customerName;
	private ArrayList<Product> product;
	Customer(String customerName){
		this.customerName=customerName;
		this.product=new ArrayList<>();
	}
	public void addProduct(String productName,int quantity){
		Product p1=new Product(productName,quantity);
		product.add(p1);
	}
	public ArrayList<Product> getProduct(){
		return product;
	}
	public void setPrice(String productNaam,int price){
		for(Product prod:product){
			if(productNaam.equals(prod.getName())){
				prod.setPrice(price);
			}
		}
	}
	
		
	public void showBill(Customer c1){
		System.out.println();
	
		System.out.println("The Name of customer :- "+c1.customerName);
	
		BillGenerator bill=new BillGenerator(c1);
		bill.showBill();
		System.out.println();
	
	}
	
}
class Product{
	private String productName;
	private int price;
	private int quantity;
	private int total=0;
	public Product(String productName,int quantity){
		this.productName=productName;
		this.quantity=quantity;
	}
	public void setPrice(int price){
		this.price=price;
	}
	
	public int totalPriceFunction(){
		return total=price*quantity;
	}
	public String getName(){
		return productName;
	}
	
	
		
}
class BillGenerator{
	private double totalPrice=0;
	public BillGenerator(Customer c1){
		for(Product prod: c1.getProduct()){
			totalPrice=totalPrice+prod.totalPriceFunction();
		}
	}
	public void showBill(){
		
		System.out.println("The total amount of all your purchased :- "+totalPrice);
	}
	
}
public class GroceryCode {
    public static void main(String[] args) {
        Customer c1=new Customer("Alice");
		
		
		c1.addProduct("Apples",2);//2 kg
		c1.addProduct("Milk",1);//1 liter
		
		
		c1.setPrice("Apples",3);//3$ per kg
		c1.setPrice("Milk",2);//2$ per liter
		
		
		c1.showBill(c1);
		
}
}
