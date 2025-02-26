import java.util.*;
public class OrderManager {
    private final ExecutorService executor = Executors.newFixedThreadPool(3);
    private final List<Order> orders = new ArrayList<>();
}
