import java.util.*;
class Product {
    private UUID productId;
    private String name;
    private double price;
    private int stockLevel;
    private int reorderThreshold;

    public Product(String name, double price, int stockLevel, int reorderThreshold) {
        this.productId = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.stockLevel = stockLevel;
        this.reorderThreshold = reorderThreshold;
    }

    public UUID getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStockLevel() { return stockLevel; }
    public int getReorderThreshold() { return reorderThreshold; }

    public void sellProduct(int quantity) {
        if (quantity > stockLevel) {
            System.out.println("Not enough stock available for " + name);
        } else {
            stockLevel -= quantity;
            System.out.println(quantity + " units sold. Remaining stock of " + name + ": " + stockLevel);
        }
    }

    public void restock(int quantity) {
        stockLevel += quantity;
        System.out.println("Restocked " + name + " by " + quantity + " units. New stock level: " + stockLevel);
    }

    public void displayInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock Level: " + stockLevel);
        System.out.println("Reorder Threshold: " + reorderThreshold);
        System.out.println("----------------------------");
    }
}