import StrategyDesign.*;

public class Paypal extends PaymentContext{
    Paypal(){
        super(new PaypalPayment());
    }
}
