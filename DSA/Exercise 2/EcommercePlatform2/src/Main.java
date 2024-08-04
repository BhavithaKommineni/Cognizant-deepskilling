public class Main {
    public static void main(String[] args) {
        // Create an array of products
        Product[] products = {
            new Product(5, "Laptop", "Electronics"),
            new Product(3, "Shoes", "Apparel"),
            new Product(9, "Smartphone", "Electronics"),
            new Product(1, "Watch", "Accessories")
        };

        // Display products
        System.out.println("Products before sorting:");
        for (Product product : products) {
            System.out.println(product);
        }

        // Linear Search Test
        int linearIndex = LinearSearchAlgorithms.linearSearch(products, 3);
        System.out.println("\nLinear Search result for productId 3:");
        if (linearIndex != -1) {
            System.out.println(products[linearIndex]);
        } else {
            System.out.println("Product not found!");
        }

        // Sort products for binary search
        BinarySearchAlgorithms.sortProducts(products);

        // Display products after sorting
        System.out.println("\nProducts after sorting:");
        for (Product product : products) {
            System.out.println(product);
        }

        // Binary Search Test
        int binaryIndex = BinarySearchAlgorithms.binarySearch(products, 3);
        System.out.println("\nBinary Search result for productId 3:");
        if (binaryIndex != -1) {
            System.out.println(products[binaryIndex]);
        } else {
            System.out.println("Product not found!");
        }
    }
}

