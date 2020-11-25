package designpattern.behavioral.visitor;

import designpattern.behavioral.visitor.items.Keys;
import designpattern.behavioral.visitor.items.Phone;
import designpattern.behavioral.visitor.items.Wallet;
import designpattern.behavioral.visitor.visitor.AfterPartyVisitor;
import designpattern.behavioral.visitor.visitor.BeforePartyVisitor;
import designpattern.behavioral.visitor.visitor.PartyVisitor;

import java.util.List;

public class App {
    public static void main(String[] args) {
        PartyVisitor goingOut = new BeforePartyVisitor();
        PartyVisitor returningHome = new AfterPartyVisitor();
        Person me = new Person(List.of(new Keys(4), new Wallet(150.0), new Phone(67)));

        me.accept(goingOut);
        System.out.println("*** party time! ***");
        me.accept(returningHome);
    }
}
