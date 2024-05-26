
class PayPalPayment implements PaymentStrategy {
    public boolean pay(double amount) {
        System.out.println("Making payment using PayPal");

        return true;
    }
}