public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName ;
    private String expiryDate ;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using Credit Card. Card Number: " + cardNumber+"  cardholderName: " + cardHolderName +"  expiryDate:  " + expiryDate );
    }
}