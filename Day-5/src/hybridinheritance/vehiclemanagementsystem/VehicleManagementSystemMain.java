package hybridinheritance.vehiclemanagementsystem;

public class VehicleManagementSystemMain {
 public static void main(String[] args) {
    // Electric Vehicle
    ElectricVehicle electricVehicle = new ElectricVehicle("Tesla", 200, 75);
    System.out.println("Electric Vehicle Details");
    electricVehicle.displayDetails();
    electricVehicle.charge();
    System.out.println();

    // Petrol Vehicle
    PetrolVehicle petrolVehicle = new PetrolVehicle("Toyota", 180, 50);
    System.out.println("Petrol Vehicle Details");
    petrolVehicle.displayDetails();
    petrolVehicle.refuel();
}
}