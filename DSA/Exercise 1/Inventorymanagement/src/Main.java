public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        // Adding products
        ims.addProduct(new Product(1, "Laptop", 10, 1500.0));
        ims.addProduct(new Product(2, "Smartphone", 20, 800.0));

        // Display inventory
        System.out.println("Inventory after adding products:");
        ims.displayInventory();

        // Updating a product
        ims.updateProduct(1, "Laptop", 8, 1450.0);

        // Display inventory
        System.out.println("Inventory after updating a product:");
        ims.displayInventory();

        // Deleting a product
        ims.deleteProduct(2);

        // Display inventory
        System.out.println("Inventory after deleting a product:");
        ims.displayInventory();
    }
}
