package singleinheritance.smartHomeDevices;

public class SmartHomeDeviceMain {  public static void main(String[] args) {

    // Create a thermostat device
    Thermostat thermostat1 = new Thermostat(002, "Online", 22);
    thermostat1.displayStatus();
}
}