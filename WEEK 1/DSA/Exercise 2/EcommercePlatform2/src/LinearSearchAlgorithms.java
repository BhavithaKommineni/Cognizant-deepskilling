public class LinearSearchAlgorithms {

    // Linear Search
    public static int linearSearch(Product[] products, int productId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == productId) {
                return i;
            }
        }
        return -1; // Not found
    }

    /**
     * @param products
     */
    public static void sortProducts(Product[] products) {
        throw new UnsupportedOperationException("Unimplemented method 'sortProducts'");
    }
}
