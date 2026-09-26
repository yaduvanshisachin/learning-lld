package Problems.Nofication_System;

//Decorator : adds extra info to notification dynamically
public abstract class INotificationDecorator implements  INotification {
    protected INotification notification;

    public INotificationDecorator(INotification notification) {
        this.notification = notification;
    }
}

//concreate Decorators
class TimeStampDecorator extends INotificationDecorator{
    public TimeStampDecorator(INotification n) {
        super(n);
    }

    @Override
    public String getContent() {
        return "[2026-09-26 14:22:00" + notification.getContent();
    }
}

class SignatureDecorator extends INotificationDecorator {
    private String signature;

    public SignatureDecorator(INotification n, String signature) {
        super(n);
        this.signature = signature;
    }

    @Override
    public String getContent() {
        return signature + notification.getContent();
    }
}