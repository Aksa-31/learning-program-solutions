public class FinancialForecastingRecursive {
    public static double futureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        } else {
            return futureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
        }
    }

    public static void main(String[] args) {
        double presentValue = 1000;
        double growthRate = 0.05;
        int years = 3;

        double futureVal = futureValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f\n", years, futureVal);
    }
}
