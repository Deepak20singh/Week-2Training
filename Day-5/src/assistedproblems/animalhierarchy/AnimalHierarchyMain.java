package assistedproblems.animalhierarchy;

public class AnimalHierarchyMain {
    public static void main(String[] args) {
        Animal dog=new Dog("Dogo",5);
        dog.makeSound();
        Animal cat=new Cat("Sweetie",5);
        dog.makeSound();
        Animal bird=new Bird("Peacock",6);
        dog.makeSound();
    }
}
