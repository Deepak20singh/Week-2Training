package assistedproblems.vehicleandtransportsystem;

public class Truck extends Vehicle{
    private int seat;
public Truck(String name,String fuelType,int maxSpeed,int seat){
    super(name,fuelType,maxSpeed);
    this.seat=seat;
}
public void displayInfo(){
    System.out.println("Hey jani ,i am Truck");
    System.out.println("Seats in vehicle :- "+seat);

    System.out.println();

}
}
