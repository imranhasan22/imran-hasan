class BankPayment implements PaymentStrategy {
    public boolean pay(double amount) {
        System.out.println("Making payment using bank transfer");

        return true;
    }
}