package Problems.Nofication_System;

public interface INotificationStrategy {
    void sendNotifiction(String content);
}

class EmailStrategy implements INotificationStrategy {

    @Override
    public void sendNotifiction(String content) {
        System.out.println("sending notificatio though email" + content);
    }
}

class SmsStrategy implements INotificationStrategy {
    @Override
    public void sendNotifiction(String content) {
        
        
    }
}

class PushStrategy implements INotificationStrategy {
    @Override
    public void sendNotifiction(String content) {
        
    }
}