package designpattern.behavioral.visitor.items;

import designpattern.behavioral.visitor.visitor.PartyVisitor;

public interface NecessaryItem {
    void accept(PartyVisitor visitor);
}
