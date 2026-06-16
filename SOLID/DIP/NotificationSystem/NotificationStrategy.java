package SOLID.DIP.NotificationSystem;

public interface NotificationStrategy {
    //I have different strategies (family of algorithms)
    void send(String msg);
}


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