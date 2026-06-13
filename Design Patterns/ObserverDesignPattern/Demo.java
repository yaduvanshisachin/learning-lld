package ObserverDesignPattern;

import java.util.HashSet;
import java.util.Set;

// Observer Design Pattern

interface IChannel {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();
}

interface ISubscriber {
    void update();
}

// Observable 
class Channel implements IChannel {
    private String channelName;
    private Set<Subscriber> subscribers = new HashSet<>();
    private String latestVideo;

    Channel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        subscriber.setChannel(this); // establish relationship
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void uploadNewVideo(String newVideoTitle) {
        this.latestVideo = newVideoTitle;

        System.out.println(
                "\n" + channelName + " uploaded a new video: " + newVideoTitle);

        notifySubscribers();
    }

    public String getLatestVideo() {
        return latestVideo;
    }

    public String getChannelName() {
        return channelName;
    }
}

// Observer
class Subscriber implements ISubscriber {
    private String name;
    private Channel channel;

    Subscriber(String name) {
        this.name = name;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void update() {
        System.out.println(
                name + " received notification -> New video uploaded by "
                        + channel.getChannelName()
                        + ": "
                        + channel.getLatestVideo());
    }
}

public class Demo {
    public static void main(String[] args) {
        //channels
        Channel channel1 = new Channel("CoderArmy");
        Channel channel2 = new Channel("Striver");
        
        //subscribers
        Subscriber subs1 = new Subscriber("Ram");
        Subscriber subs2 = new Subscriber("Shyam");
        Subscriber subs3 = new Subscriber("Tarun");
        Subscriber subs4 = new Subscriber("Varun");

        channel1.subscribe(subs1);
        channel1.subscribe(subs2);
        channel2.subscribe(subs3);
        channel2.subscribe(subs4);

        channel1.uploadNewVideo("Java Multithreading");
        channel1.uploadNewVideo("Observer Design Pattern");

        channel2.uploadNewVideo("Dynamic Programming");
    }
}