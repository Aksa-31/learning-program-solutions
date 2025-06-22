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

public class QuickSortOrders {

    static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
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

        quickSort(orders, 0, orders.length - 1);
        System.out.println("Sorted Orders using Quick Sort:");
        printOrders(orders);
    }
}
