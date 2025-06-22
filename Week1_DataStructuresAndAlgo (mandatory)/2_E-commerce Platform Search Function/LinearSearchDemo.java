public class LinearSearchDemo {
    public static int linearSearch(Product[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Tablet", "Electronics")
        };

        int result = linearSearch(products, "Shoes");
        System.out.println(result != -1 ? "Found at index " + result : "Not Found");
    }
}
