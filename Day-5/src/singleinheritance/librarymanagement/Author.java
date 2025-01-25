package singleinheritance.librarymanagement;

public class Author extends Book{
    private String name,bio;

    public Author(String title,int publicationYear,String name,String bio){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;

    }
    public void displayInfo(){
        System.out.println("Author name of Book :- "+name);
        System.out.println("Description of Book :- "+bio);


        System.out.println();

    }
}
