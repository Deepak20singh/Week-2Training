package singleinheritance.smartHomeDevices;



public class Device {
    private int deviceId;
    private String status;
    Device(int deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    public void displayStatus(){
        System.out.println("Device id :- "+deviceId+" Status of device :- "+status);
    }
}
