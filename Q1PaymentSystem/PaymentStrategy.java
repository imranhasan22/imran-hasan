interface PaymentStrategy {
    boolean pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    public boolean pay(double amount) {
        System.out.println("Making payment using credit card");
   
        return true;
    }
}