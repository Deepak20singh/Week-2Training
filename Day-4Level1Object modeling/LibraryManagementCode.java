import java.util.*;


class Book{

private String title;
private String author;

Book (String title, String author){
this.title=title;
this.author=author;
}
// gettter method to get title 
public String getTitle(){
return title;
}

// getter method to get the author
public String getAuthor(){
return author;
}

public void print(){
System.out.println("Book: "+title+"\nAuthor: "+author+"\n");
}

// here we created our book library
}


// creating Library class
class Library{

private String name;
private ArrayList<Book> books;

// constructor of library class 
Library(String name){
this.name=name;
this.books=new ArrayList<>();
}
// adding book to our library
public void addBook(Book book1){
books.add(book1);
}


// displaying books present in current object of lirary
public void display(){
System.out.println("The books are in "+name+" Library are: ");
for(Book s:books){
System.out.println(s.getTitle());
}


}


}

public class LibraryManagementCode{
public static void main(String args[]){

// Creating objects of Book
Book book1=new Book("Rayagan","Dev");
book1.print();

Book book2=new Book("RashmiRathi","Karna");
book2.print();
// creating library

Library library1=new Library("Takshashila");
Library library2=new Library("Indi");

library1.addBook(book1);
library2.addBook(book2);

library1.display();
library2.display();

}


}