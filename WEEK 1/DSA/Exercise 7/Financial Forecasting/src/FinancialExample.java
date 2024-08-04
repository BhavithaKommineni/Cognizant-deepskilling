public class FinancialExample {
    public static void main(String[] args) {
        double presentValue = 1000.0;  // Initial amount
        double growthRate = 0.05;      // 5% growth rate
        int periods = 10;              // Number of periods (years)

        double futureValue = FinancialForecasting.calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: $" + futureValue);
    }
}
