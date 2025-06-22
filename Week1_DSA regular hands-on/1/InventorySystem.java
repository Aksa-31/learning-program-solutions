import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
    String productId;
    String productName;
    int quantity;
    double price;

    Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return productId + " - " + productName + ", Qty: " + quantity + ", Price: ₹" + price;
    }
}

public class InventorySystem {
    static Map<String, Product> inventory = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View Inventory");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addProduct(); break;
                case 2: updateProduct(); break;
                case 3: deleteProduct(); break;
                case 4: viewInventory(); break;
                case 5: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    static void addProduct() {
        System.out.print("Product ID: ");
        String id = sc.nextLine();
        if (inventory.containsKey(id)) {
            System.out.println("Already exists.");
            return;
        }
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Quantity: ");
        int qty = sc.nextInt();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        inventory.put(id, new Product(id, name, qty, price));
        System.out.println("Added.");
    }

    static void updateProduct() {
        System.out.print("Product ID: ");
        String id = sc.nextLine();
        if (!inventory.containsKey(id)) {
            System.out.println("Not found.");
            return;
        }
        System.out.print("New Quantity: ");
        int qty = sc.nextInt();
        System.out.print("New Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        Product p = inventory.get(id);
        p.quantity = qty;
        p.price = price;
        System.out.println("Updated.");
    }

    static void deleteProduct() {
        System.out.print("Product ID: ");
        String id = sc.nextLine();
        if (inventory.remove(id) != null) {
            System.out.println("Deleted.");
        } else {
            System.out.println("Not found.");
        }
    }

    static void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("No products.");
        } else {
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }
}
