package assistedproblems.vehicleandtransportsystem;

public class Car extends Vehicle{
    private int seatCapacity;

    public Car(String name,String fuelType,int maxSpeed,int seatCapacity){
        super(name,fuelType,maxSpeed);
        this.seatCapacity=seatCapacity;
    }
    public void displayInfo(){
        System.out.println("Hey bro, Car here");
        System.out.println("Seats in vehicle :- "+seatCapacity);

        System.out.println();

    }
}