package hybridinheritance.vehiclemanagementsystem;

public class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelCapacity; // in liters

    public PetrolVehicle(String model, int maxSpeed, double fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
        System.out.println("Fuel Capacity :- " + fuelCapacity + " liters");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Capacity :- " + fuelCapacity + " liters");
    }
}