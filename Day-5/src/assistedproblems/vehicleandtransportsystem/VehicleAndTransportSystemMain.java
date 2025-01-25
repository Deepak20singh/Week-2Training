package assistedproblems.vehicleandtransportsystem;

public class VehicleAndTransportSystemMain {
    public static void main(String args[]) {

        Vehicle car = new Car("Maruti", "petrol", 120, 5);
        car.displayInfo();
        Vehicle truck = new Truck("Tata ", "petrol", 200, 2);
        truck.displayInfo();
        Vehicle motorcycle = new Motorcycle("splender", "Diesel", 240, 2);
        motorcycle.displayInfo();

    }
}