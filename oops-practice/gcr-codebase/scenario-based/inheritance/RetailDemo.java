class Order {
    private String orderId, orderDate;
    public Order(String id, String date) { orderId = id; orderDate = date; }
    public String getOrderStatus() { return "Order Placed"; }
}

class ShippedOrder extends Order {
    private String trackingNumber;
    public ShippedOrder(String id, String date, String tracking) {
        super(id, date); this.trackingNumber = tracking;
    }
    @Override
    public String getOrderStatus() { return "Order Shipped, Tracking: " + trackingNumber; }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;
    public DeliveredOrder(String id, String date, String tracking, String deliveryDate) {
        super(id, date, tracking); this.deliveryDate = deliveryDate;
    }
    @Override
    public String getOrderStatus() { return "Order Delivered on " + deliveryDate; }
}

public class RetailDemo {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder("O101", "2026-06-20", "TRK123", "2026-06-23");
        System.out.println(d.getOrderStatus());
    }
}
