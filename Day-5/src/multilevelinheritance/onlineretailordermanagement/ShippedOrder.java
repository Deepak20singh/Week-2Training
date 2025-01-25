package multilevelinheritance.onlineretailordermanagement;

public class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("Order shipped with tracking number :- " + trackingNumber
    );
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number :- " + trackingNumber);
    }
}