import java.util.UUID;

class Product {

    private UUID productId;
    private String name;
    private double price;
    private int stockLevel;
    private int reorderThreshold;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int stockLevel, int reorderThreshold) {
        this.name = name;
        this.price = price;
        this.stockLevel = stockLevel;
        this.reorderThreshold = reorderThreshold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public int getReorderThreshold() {
        return reorderThreshold;
    }

    public void setReorderThreshold(int reorderThreshold) {
        this.reorderThreshold = reorderThreshold;
    }
    public void sellProduct(int quantity) {
        if (quantity>stockLevel) {
            System.out.println("Sorry, not enough stock");
        }
        else {
            stockLevel -= quantity;
            System.out.println(quantity + "sold, Remaining: " + stockLevel);
        }
    }
        public void restock(int quantity) {
            stockLevel += quantity;
            System.out.println(quantity + "restocked, Remaining: " + stockLevel);
        }
}
