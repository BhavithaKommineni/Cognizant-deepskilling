// StrategyPatternTest.java
public class StrategyPatternTest {
    public static void main(String[] args) {
        // Create a payment context
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment("1234-5678-9876-5432", "Alice", "12/25"));

        // Execute payment using Credit Card
        paymentContext.executePayment(150.0);

        // Change the payment strategy to PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("alice@example.com"));

        // Execute payment using PayPal
        paymentContext.executePayment(200.0);
    }
}
