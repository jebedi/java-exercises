package designpattern.behavioral.observer;

import designpattern.behavioral.observer.subject.NewsletterSender;
import designpattern.behavioral.observer.subject.Subject;
import designpattern.behavioral.observer.subscriber.CasualSubscriber;
import designpattern.behavioral.observer.subscriber.Subscriber;

public class App {
    public static void main(String[] args) {
        Subscriber casual1 = new CasualSubscriber();
        Subscriber casual2 = new CasualSubscriber();
        Subscriber casual3 = new CasualSubscriber();
        Subscriber casual4 = new CasualSubscriber();

        Subject<Subscriber> newsletter = new NewsletterSender();
        newsletter.addSubscriber(casual1);
        newsletter.addSubscriber(casual2);
        newsletter.addSubscriber(casual3);

        newsletter.notifySubscribers("Tanie piwo w Biedronce");
    }
}
