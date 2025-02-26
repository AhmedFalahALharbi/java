# Inventory and Order Management System

## Overview
This project is designed to manage product inventory and predict restocking needs while also handling cloud-based order processing. The system consists of two main components:

1. **Inventory Management System** - Tracks product inventory and predicts when restocking is needed.
2. **Cloud-Ready Order Processing System** - Manages orders and updates statuses in real-time.

## Features
### Inventory Management System
- **Product Class:**
  - `productId` (UUID)
  - `name` (String)
  - `price` (Double)
  - `stockLevel` (Integer)
  - `reorderThreshold` (Integer)
- **StockPredictor Class:**
  - Predicts when stock will run out based on average daily sales.
  - Suggests a restocking strategy.

### Cloud-Ready Order Processing System
- **Order Class:**
  - `orderId` (UUID)
  - `customerName` (String)
  - `productId` (UUID)
  - `quantity` (Integer)
  - `orderStatus` (Enum: PENDING, SHIPPED, DELIVERED)
- **OrderManager Class:**
  - Processes new orders.
  - Automatically updates order status using multithreading.
  - Logs each order update.

## Installation & Usage
### Prerequisites
- Java (JDK 8+)
- Git
- IntelliJ IDEA (or any Java IDE)

### Steps to Run
1. **Clone the Repository**
   ```sh
   git clone <repository-url>
   cd <repository-folder>
   ```
2. **Compile and Run the Project**
   ```sh
   javac Main.java
   java Main
   ```
3. **Enter Input When Prompted**
   - Example:
     ```
     Enter average daily sales for Laptop: 4
     Enter average daily sales for Smartphone: 2
     ```
4. **View Output**
   ```
   Product ID: 123e4567-e89b-12d3-a456-426614174000
   Name: Laptop
   Price: $1200.0
   Stock Level: 20
   Reorder Threshold: 5
   ----------------------------
   Stock Prediction for Laptop:
   Days until stock out: 5
   Restock Suggestion: Moderate: Consider restocking soon.
   ```

## Marks Distribution
1. **Inventory Management System (6 Marks)**
   - 3 Marks - Implementing Product and StockPredictor classes correctly.
   - 3 Marks - Predicting stock depletion and suggesting restocking.
2. **Cloud-Ready Order Processing System (6 Marks)**
   - 2 Marks - Implementing Order class with status tracking.
   - 2 Marks - Managing orders with real-time updates via multithreading.
   - 2 Marks - Logging system implementation.

## Contributing
1. **Create a feature branch:**
   ```sh
   git checkout -b feature-branch
   ```
2. **Commit changes:**
   ```sh
   git add .
   git commit -m "Add new feature"
   ```
3. **Push changes:**
   ```sh
   git push origin feature-branch
   ```
4. **Create a Pull Request on GitHub.**

## License
This project is licensed under the MIT License.

## Contact
For any issues, contact **Ahmed Falah Alharbi**.

