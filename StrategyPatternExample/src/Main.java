public class Main {
    public static void main(String[] args) {
        //Credit Card test
        PaymentContext payment = new CreditCard();
        //PayPal Test
        PaymentContext payment2 = new Paypal();

        payment.pay();
        payment2.pay();
    }
}
