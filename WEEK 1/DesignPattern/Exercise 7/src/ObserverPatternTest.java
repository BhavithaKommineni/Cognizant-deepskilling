// ObserverPatternTest.java
public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create a stock market
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp = new WebApp("WebApp");

        // Register observers with the stock market
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp);

        // Change stock price and notify observers
        stockMarket.setStockPrice(100.50);
        stockMarket.setStockPrice(105.75);

        // Deregister an observer and change stock price again
        stockMarket.deregisterObserver(mobileApp2);
        stockMarket.setStockPrice(102.25);
    }
}
