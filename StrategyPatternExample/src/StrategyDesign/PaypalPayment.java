package StrategyDesign;

public class PaypalPayment  implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paypal payment done");
    }
}