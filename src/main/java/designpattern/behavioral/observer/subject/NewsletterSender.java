package designpattern.behavioral.observer.subject;

import designpattern.behavioral.observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class NewsletterSender implements Subject<Subscriber> {
    private final List<Subscriber> subscriberList;

    public NewsletterSender() {
        this.subscriberList = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void notifySubscribers(String text) {
        subscriberList.forEach(s -> s.update(text));
    }
}
