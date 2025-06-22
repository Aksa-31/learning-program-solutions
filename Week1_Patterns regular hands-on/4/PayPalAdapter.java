public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway gateway) {
        this.payPalGateway = gateway;
    }

    public void processPayment(double amount) {
        payPalGateway.makePayment(amount);
    }
}
