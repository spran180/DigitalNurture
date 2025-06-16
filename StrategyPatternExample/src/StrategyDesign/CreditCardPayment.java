package StrategyDesign;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Credit card payment done");
    }
}