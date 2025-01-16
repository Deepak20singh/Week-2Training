import java.util.Scanner;

public class Book {
	String title, author;
	int price;
	
	Book(String title,String author,int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	void display(){
		System.out.printf("Title of the book is : %s%nThe author of the book is:- %s%nThe price of the book is :- %d",title,author,price);
	} 
    }
    
   public class BookCode{

    public static void main(String[] args) {
		
		//Program to Display Employee Details

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a title of book: ");
        String title = sc.nextLine();
         
		System.out.print("Enter a author of book: ");
        String author = sc.nextLine();
       
        System.out.print("Enter the price of book: ");
        int price = sc.nextInt();
		
		Book vr=new Book(title,author,price);
		
		vr.display();
		}
}
