public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
        context.payAmount(1500.0);

        context.setPaymentStrategy(new PayPalPayment("aksa@example.com"));
        context.payAmount(2300.0);
    }
}
