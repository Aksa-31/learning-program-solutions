import java.util.Arrays;
import java.util.Comparator;

public class BinarySearchDemo {
    public static int binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0)
                return mid;
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Tablet", "Electronics")
        };

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int result = binarySearch(products, "Tablet");
        System.out.println(result != -1 ? "Found at index " + result : "Not Found");
    }
}
