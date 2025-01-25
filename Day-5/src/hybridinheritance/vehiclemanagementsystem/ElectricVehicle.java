package hybridinheritance.vehiclemanagementsystem;

public class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging the electric vehicle...");
        System.out.println("Battery Capacity :- " + batteryCapacity + " kWh");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity :- " + batteryCapacity + " kWh");
    }
}

