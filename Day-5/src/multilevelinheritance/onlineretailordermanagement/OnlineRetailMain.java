package multilevelinheritance.onlineretailordermanagement;

public class OnlineRetailMain {
    public static void main(String[] args) {
    // Creating an Order object
    Order order = new Order(101, "20/01/2025");
    order.getOrderStatus();
    order.displayOrderDetails();
    System.out.println();

    // Creating a ShippedOrder object
    ShippedOrder shippedOrder = new ShippedOrder(102, "21/01/2025", "Tr02u98");
    shippedOrder.getOrderStatus();
    shippedOrder.displayOrderDetails();
    System.out.println();

    // Creating a DeliveredOrder object
    DeliveredOrder deliveredOrder = new DeliveredOrder(103, "20/01/2025", "Tr09288e", "23/01/2025");
    deliveredOrder.getOrderStatus();
    deliveredOrder.displayOrderDetails();
}
}