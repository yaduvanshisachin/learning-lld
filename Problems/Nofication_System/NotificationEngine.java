package Problems.Nofication_System;

import java.util.List;
import java.util.ArrayList;

public class NotificationEngine implements IObserver{
    NotificationObservable notificationObservable;
    List<INotificationStrategy> notificationStrategies = new ArrayList<>();

    NotificationEngine(NotificationObservable observable) {
        this.notificationObservable = observable;
    }

    void addNotificationStrategy(INotificationStrategy ns) {
        this.notificationStrategies.add(ns);
    }

    @Override
    public void update() {
        // String notificationContent = notificationObservable.();

        // for(var notificationStrategy : notificationStrategies) {
        //     notificationStrategy.sendNotifiction(notificationContent);
        // }
    }
}
