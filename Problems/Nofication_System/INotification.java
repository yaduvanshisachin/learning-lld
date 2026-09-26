package Problems.Nofication_System;

public interface INotification {
    String getContent();
}

//Concreate Notifications --> SimpleNotification, HTMLNotifcation

class SimpleNotification implements INotification {
    private String textMsg;

    public SimpleNotification(String msg) {
        this.textMsg = msg;
    }

    @Override
    public String getContent() {
        return textMsg;
    }
}
