public class StockPredictor {
    public static int daysUntilStockRunsOut(Product product, int avgDailySales) {
        if (avgDailySales == 0) return Integer.MAX_VALUE; // Avoid division by zero
        return product.getStockLevel() / avgDailySales;
    }

    public static String getRestockSuggestion(Product product, int avgDailySales) {
        int daysLeft = daysUntilStockRunsOut(product, avgDailySales);
        if (daysLeft <= 3) return "Urgent: Restock immediately!";
        else if (daysLeft <= 7) return "Moderate: Consider restocking soon.";
        else return "Sufficient: No immediate restocking needed.";
    }
}
