package hybridinheritance.restaurantmanagementsystem;

public class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing dishes in the kitchen.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role :- Chef");
    }
}
