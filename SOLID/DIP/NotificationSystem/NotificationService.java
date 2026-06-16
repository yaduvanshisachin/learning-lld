package SOLID.DIP.NotificationSystem;

//NotificationService has-a diff strategies to send notification
public class NotificationService {
    private NotificationStrategy strategy;

    NotificationService(NotificationStrategy strategy){
        this.strategy = strategy;
    }

    void notifyUser(String messege){
        //deligate sending responsibility to Notification strategy
        strategy.send(messege);
    }
}


//Dip :  High level module should not depend on low-level modules both should depend on abstration     
// Notification service does not need to know about  how notification will be sent



//******************DIP violation****************//

// class EmailService{
//     void send(String message){
//         System.out.println("Email sent: " + message);
//     }
// }

// class NotificationService{
//     private EmailService emailService = new EmailService();

//     void notifyUser(String message){
//         emailService.send();
//     }
// }

// Here NotificationService is tighly coupled/dependent with EmailService 
// Tommorow if you have SmsService, you have to change NotificationService Class ==> OCP Violation

// Notification service does not need to know about  how notification will be sent
