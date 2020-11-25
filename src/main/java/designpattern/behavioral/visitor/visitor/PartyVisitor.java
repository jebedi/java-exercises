package designpattern.behavioral.visitor.visitor;

import designpattern.behavioral.visitor.items.Keys;
import designpattern.behavioral.visitor.items.Phone;
import designpattern.behavioral.visitor.items.Wallet;

public interface PartyVisitor {
    void visit(Keys keys);

    void visit(Phone phone);

    void visit(Wallet wallet);
}
