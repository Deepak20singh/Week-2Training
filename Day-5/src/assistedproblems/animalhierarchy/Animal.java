package assistedproblems.animalhierarchy;

public class Animal {
    private String name;
    private int age;
    Animal(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Name of animal :- "+name);
        System.out.println("Age of animal :- "+age);

    }
    public void makeSound(){
        System.out.println("Animal");
    }
}
