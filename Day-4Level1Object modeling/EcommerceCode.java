import java.util.*;

class Customer{
	private String customerName;
	private ArrayList<Order> order;
	
	public Customer(String customerName){
		this.customerName=customerName;
		this.order=new ArrayList<>();
	}
	
	public void addOrder(String orderN){
		
		Order ord=new Order(orderN);
		
		order.add(ord);
		
	}
	public void set(String orderNaam,String productNaam){
		for(Order ord:order){
			if(orderNaam.equals(ord.orderName)){
				ord.addProduct(productNaam);
			}
			}
	}
		
		public void showDetail(){
			System.out.println("Name of customer :- "+customerName);
			for(Order ord:order){
				System.out.println("Name of the order :- "+ord.orderName);
				System.out.println("Products ");
				ord.showDetailProduct();
				System.out.println();
				
			}
		}
		
		
}
class Order{
	public String orderName;
	private ArrayList<Product> product;
	
	public Order(String orderName){
		this.orderName=orderName;
		this.product=new ArrayList<>();
	}
	public void addProduct(String productN){
		Product p=new Product(productN);
		
		product.add(p);
	}
	public void showDetailProduct(){
			for(Product cou:product){
				System.out.println("Name of the products :- "+cou.productName);
				
				
			}
		}
	
	
}
class Product{
	public String productName;
	public Product(String productName){
		this.productName=productName;
	}
	
		
}
	public class EcommerceCode{
		public static void main(String args[]){
			Customer c1=new Customer("Dev");
			Customer c2=new Customer("Aditya");
			
			
			c1.addOrder("Fruit order");
			c1.addOrder("Electronics order");
			
			c1.set("Fruit order","Apple");
			c1.set("Fruit order","Mango");
			c1.set("Fruit order","PineApple");
			
			c1.set("Electronics order","Fan");
			c1.set("Electronics order","AC");
			
			
			c2.addOrder("Household order");
			c2.addOrder("Electronics order");
			
			c2.set("Household order","Spoon");
			c2.set("Household order","Fork");
			c2.set("Household order","Knife");
			
			c2.set("Electronics order","Fan");
			c2.set("Electronics order","AC");
			
			c1.showDetail();
			c2.showDetail();
			
			
		}
	}