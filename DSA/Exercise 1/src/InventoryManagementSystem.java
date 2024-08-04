    import java.util.HashMap;
    import java.util.Map;
    
    public class InventoryManagementSystem {
        private Map<Integer, Product> inventory;
    
        public InventoryManagementSystem() {
            this.inventory = new HashMap<>();
        }
    
        // Method to add a product
        public void addProduct(Product product) {
            inventory.put(product.getProductId(), product);
        }
    
        // Method to update a product
        public void updateProduct(int productId, String productName, int quantity, double price) {
            Product product = inventory.get(productId);
            if (product != null) {
                product.setProductName(productName);
                product.setQuantity(quantity);
                product.setPrice(price);
            } else {
                System.out.println("Product not found!");
            }
        }
    
        // Method to delete a product
        public void deleteProduct(int productId) {
            if (inventory.remove(productId) == null) {
                System.out.println("Product not found!");
            }
        }
    
        // Method to display the inventory
        public void displayInventory() {
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }
     

