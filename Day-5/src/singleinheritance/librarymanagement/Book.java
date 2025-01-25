package singleinheritance.librarymanagement;

public class Book {
    private String title;
    private int publicationYear;
    Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
        System.out.println("Title of book:- "+title);

        System.out.println("Year of publication :- "+publicationYear);

    }
    public void displayInfo(){
        System.out.println("Book");
    }
}