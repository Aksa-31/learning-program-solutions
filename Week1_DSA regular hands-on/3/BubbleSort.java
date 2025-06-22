import java.util.Scanner;

class Order {
    String orderId;
    String customerName;
    double totalPrice;

    Order(String orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public String toString() {
        return orderId + " | " + customerName + " | ₹" + totalPrice;
    }
}

public class BubbleSortOrders {

    static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 2500.00),
            new Order("O002", "Bob", 1500.00),
            new Order("O003", "Charlie", 3200.00),
            new Order("O004", "David", 1800.00)
        };

        bubbleSort(orders);
        System.out.println("Sorted Orders using Bubble Sort:");
        printOrders(orders);
    }
}
