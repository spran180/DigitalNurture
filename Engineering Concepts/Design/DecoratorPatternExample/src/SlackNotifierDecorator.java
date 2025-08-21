public class SlackNotifierDecorator extends NotifierDecorator{
    private final Notifier notifier;

    public SlackNotifierDecorator(Notifier notifier){
        this.notifier = notifier;
    }

    @Override
    public void send(){
        notifier.send();
        System.out.println("Notification is also send through Slack");
    }
}
