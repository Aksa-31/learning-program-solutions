public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway gateway) {
        this.stripeGateway = gateway;
    }

    public void processPayment(double amount) {
        stripeGateway.sendPayment(amount);
    }
}
