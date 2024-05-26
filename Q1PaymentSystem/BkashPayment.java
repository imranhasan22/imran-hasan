class BkashPayment implements PaymentStrategy {
    public boolean pay(double amount) {
        System.out.println("Making payment using Bkash");
        return true;
    }
}