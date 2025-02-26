import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Product laptop = new Product("Laptop", 1200.0, 20, 5);
        Product smartphone = new Product("Smartphone", 800.0, 10, 3);


        laptop.displayInfo();
        smartphone.displayInfo();


        System.out.print("Enter average daily sales for Laptop: ");
        int laptopSales = scanner.nextInt();
        System.out.print("Enter average daily sales for Smartphone: ");
        int smartphoneSales = scanner.nextInt();


        System.out.println("Stock Prediction for Laptop:");
        System.out.println("Days until stock out: " + StockPredictor.daysUntilStockRunsOut(laptop, laptopSales));
        System.out.println("Restock Suggestion: " + StockPredictor.getRestockSuggestion(laptop, laptopSales));

        System.out.println("Stock Prediction for Smartphone:");
        System.out.println("Days until stock out: " + StockPredictor.daysUntilStockRunsOut(smartphone, smartphoneSales));
        System.out.println("Restock Suggestion: " + StockPredictor.getRestockSuggestion(smartphone, smartphoneSales));


        OrderManager orderManager = new OrderManager();
        orderManager.placeOrder(new Order("John Doe", laptop.getProductId(), 2));
        orderManager.placeOrder(new Order("Alice Smith", smartphone.getProductId(), 1));

      
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        orderManager.shutdown();

        scanner.close();
    }
}
