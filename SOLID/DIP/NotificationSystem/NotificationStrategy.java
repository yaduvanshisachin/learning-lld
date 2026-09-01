package SOLID.DIP.NotificationSystem;

//This is MessageService (have different strategies or family of algorithms)
public interface NotificationStrategy {
    void send(String msg);
}

//concreate strategies
class EmailNotification implements NotificationStrategy{
    @Override
    public void send(String messege) {
        System.out.println("Sending email notification : " + messege);
    }
}

class SmsNotification implements NotificationStrategy{
    @Override
    public void send(String messege) {
        System.out.println("Sending sms notification : " + messege);
    }
}