package designpattern.behavioral.visitor;

import designpattern.behavioral.visitor.items.NecessaryItem;
import designpattern.behavioral.visitor.visitor.PartyVisitor;

import java.util.List;

public class Person {
    private final List<NecessaryItem> items;

    public Person(List<NecessaryItem> items) {
        this.items = items;
    }

    void accept(PartyVisitor visitor) {
        items.forEach(i -> i.accept(visitor));
    }
}
