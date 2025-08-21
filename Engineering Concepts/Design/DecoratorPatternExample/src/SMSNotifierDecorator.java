public class SMSNotifierDecorator extends NotifierDecorator{
    private final Notifier notifier;

    public SMSNotifierDecorator(Notifier notifier){
        this.notifier = notifier;
    }

    @Override
    public void send(){
        notifier.send();
        System.out.println("Notification is also send through SMS");
    }
}
