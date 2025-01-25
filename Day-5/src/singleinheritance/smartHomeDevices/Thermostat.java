package singleinheritance.smartHomeDevices;

public class Thermostat extends Device{
    private int temperatureSetting;

    // Constructor
    public Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // Call the superclass constructor
        this.temperatureSetting = temperatureSetting;
    }
    public void displayStatus() {
        super.displayStatus(); // Call the superclass method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }

}
