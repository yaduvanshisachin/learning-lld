package Problems.Nofication_System;

import java.util.ArrayList;
import java.util.List;

public interface IObserver {
    void update();
}

interface IObservable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObserver();
}

//concrete Observable
class NotificationObservable implements IObservable {
    private List<IObserver> observers = new ArrayList<>();
    private INotification currNotification;

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    void setNotification(INotification notification) {
        currNotification = notification;
        notifyObserver();
    }

    INotification getNotification() {
        return currNotification;
    }
}

//concreate Observer 1
class Logger implements IObserver {
    private NotificationObservable notificationObservable;

    @Override
    public void update() {
        System.out.println("Logging new notificaion : \n" + 
            notificationObservable.getNotification()
        );
    }
}

