package SOLID.DIP.NotificationSystem;

public class Client{
    public static void main(String[] args) {

        NotificationService service = new NotificationService(new EmailNotification());
        service.notifyUser("Hello your Order booked");
        
        NotificationService service2 = new NotificationService(new EmailNotification());
        service2.notifyUser("Hello your Order booked");
    }
}