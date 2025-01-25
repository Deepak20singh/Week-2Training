package assistedproblems.vehicleandtransportsystem;

public class Vehicle  {
    private String fuelType;
private String name;
private int maxSpeed;

Vehicle(String name,String fuelType,int maxSpeed){
    this.name=name;
    this.fuelType=fuelType;
    this.maxSpeed=maxSpeed;
    System.out.println("Name of Vehicle :- "+name);

    System.out.println("fuelType of Vehicle :- "+fuelType);
    System.out.println("maxSpeed of Vehicle :- "+maxSpeed);

}
public void displayInfo(){
    System.out.println("Vehicle");
}

}