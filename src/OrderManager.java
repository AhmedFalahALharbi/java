import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderManager {
    private final ExecutorService executor = Executors.newFixedThreadPool(3);
    private final List<Order> orders = new ArrayList<>();

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("New order placed: " + order.getOrderId() + " for " + order.getCustomerName());
        processOrder(order);
    }

    private void processOrder(Order order) {
        executor.execute(() -> {
            try {
                Thread.sleep(2500); 
                order.setOrderStatus(OrderStatus.SHIPPED);
                Thread.sleep(2500);
                order.setOrderStatus(OrderStatus.DELIVERED);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public void shutdown() {
        executor.shutdown();
    }
}
