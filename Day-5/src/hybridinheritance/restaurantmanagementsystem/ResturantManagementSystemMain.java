package hybridinheritance.restaurantmanagementsystem;

public class ResturantManagementSystemMain {
    public static void main(String[] args) {
        // Create a Chef
        Chef chef = new Chef("Ramasya", 101);
        System.out.println("Chef Details");
        chef.displayDetails();
        chef.performDuties();
        System.out.println();

        // Create a Waiter
        Waiter waiter = new Waiter("Ronit", 202);
        System.out.println("Waiter Details");
        waiter.displayDetails();
        waiter.performDuties();
    }
}
