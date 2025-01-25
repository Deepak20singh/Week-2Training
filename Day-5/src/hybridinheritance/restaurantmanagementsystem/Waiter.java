package hybridinheritance.restaurantmanagementsystem;

public class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving food to customers.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role :- Waiter");
    }
}
