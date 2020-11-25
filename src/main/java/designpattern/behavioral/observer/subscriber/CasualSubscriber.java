package designpattern.behavioral.observer.subscriber;

public class CasualSubscriber implements Subscriber {

    @Override
    public void update(String text) {
        System.out.println("WOW! " + text);
    }
}
