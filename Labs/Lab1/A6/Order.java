package Labs.Lab1.A6;

public class Order {
    private int orderId;
    private String orderStatus;
    private Product productOpject;
    
    public Order(int orderId, String orderStatus, Product productOpject) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.productOpject = productOpject;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public Product getProductOpject() {
        return productOpject;
    }
    public void setProductOpject(Product productOpject) {
        this.productOpject = productOpject;
    }
    
    
}
