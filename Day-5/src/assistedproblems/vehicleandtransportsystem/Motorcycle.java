package assistedproblems.vehicleandtransportsystem;

public class Motorcycle extends Vehicle{
    private int seat;
    public Motorcycle(String name,String fuelType,int maxSpeed,int seat){
        super(name,fuelType,maxSpeed);
        this.seat=seat;
    }

    public void displayInfo(){
        System.out.println("Hey bro, i am new  ");
        System.out.println("Seats in vehicle :- "+seat);

        System.out.println();
    }
}