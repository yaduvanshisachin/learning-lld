package Problems.Nofication_System;
import java.util.List;
import java.util.ArrayList;

/*
    singleton class 
    NotificationService manages Notification
    Client interact with this service
 */

public class NotificationService {
    private NotificationObservable observable;
    static NotificationService instance;

    List<INotification> notificaions = new ArrayList<>();

    NotificationService() {
        observable = new NotificationObservable();
    }

    
}
