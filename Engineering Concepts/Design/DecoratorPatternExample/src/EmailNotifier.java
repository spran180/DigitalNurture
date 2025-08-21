public class EmailNotifier implements Notifier{

    @Override
    public void send(){
        System.out.println("Notification is send through Email");
    }
}
