import java.util.Arrays;

public class BinarySearchAlgorithms {

    // Binary Search
    public static int binarySearch(Product[] products, int productId) {
        int left = 0;
        int right = products.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (products[mid].getProductId() == productId) {
                return mid;
            } else if (products[mid].getProductId() < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Not found
    }
    
    public static void sortProducts(Product[] products) {
        Arrays.sort(products, (p1, p2) -> Integer.compare(p1.getProductId(), p2.getProductId()));
    }
}

