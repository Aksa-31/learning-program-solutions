public class FinancialForecastingIterative {
    public static double futureValueIterative(double presentValue, double growthRate, int years) {
        double result = presentValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }

    public static void main(String[] args) {
        double presentValue = 1000;
        double growthRate = 0.05;
        int years = 3;

        double futureVal = futureValueIterative(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years (Iterative): %.2f\n", years, futureVal);
    }
}
