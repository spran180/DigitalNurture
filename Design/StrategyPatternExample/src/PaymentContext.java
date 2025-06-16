import StrategyDesign.*;
public class PaymentContext {
    PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    void pay() {
        strategy.pay();
    }
}
