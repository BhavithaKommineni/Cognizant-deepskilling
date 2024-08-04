// BuilderPatternTest.java
public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a computer with specific configuration using the builder pattern
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setMotherboard("ASUS ROG")
                .setPowerSupply("750W")
                .build();

        // Display the configuration of the gaming PC
        gamingPC.displayConfiguration();

        // Create another computer with a different configuration
        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("Integrated")
                .setMotherboard("MSI Pro")
                .setPowerSupply("500W")
                .build();

        // Display the configuration of the office PC
        officePC.displayConfiguration();
    }
}
