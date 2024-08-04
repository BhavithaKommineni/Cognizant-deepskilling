// ProxyPatternTest.java
public class Test {
    public static void main(String[] args) {
        // Create a proxy for an image
        Image image1 = new ProxyImage("Image1.jpg");
        
        // Display image for the first time (loads and displays)
        image1.display();
        
        // Display image again (only displays, as it is cached)
        image1.display();

        // Create another proxy for a different image
        Image image2 = new ProxyImage("Image2.png");
        
        // Display the second image (loads and displays)
        image2.display();
        
        // Display the first image again to demonstrate caching
        image1.display();
    }
}
