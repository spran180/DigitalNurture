import StrategyDesign.*;

public class CreditCard extends PaymentContext{
    CreditCard(){
        super(new CreditCardPayment());
    }
}
