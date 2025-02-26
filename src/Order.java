import java.util.*;

enum OrderStatus {
    PENDING, SHIPPED, DELIVERED
}

public class Order {
    private UUID orderId;
    private String customerName;
    private UUID productId;
    private int quantity;
    private OrderStatus orderStatus;

}
