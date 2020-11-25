package designpattern.behavioral.observer.subject;

import designpattern.behavioral.observer.subscriber.Subscriber;

public interface Subject<T extends Subscriber> {
    void addSubscriber(T Subscriber);

    void notifySubscribers(String text);
}
