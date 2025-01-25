package multilevelinheritance.onlineretailordermanagement;

public class Order {
    private int orderId;
    private String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public void getOrderStatus() {
        System.out.println("Order placed");
    }
    public void displayOrderDetails() {
        System.out.println("Order ID :- " + orderId);
        System.out.println("Order Date :- " + orderDate);
    }

}
