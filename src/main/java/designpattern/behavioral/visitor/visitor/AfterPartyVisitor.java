package designpattern.behavioral.visitor.visitor;

import designpattern.behavioral.visitor.items.Keys;
import designpattern.behavioral.visitor.items.Phone;
import designpattern.behavioral.visitor.items.Wallet;

public class AfterPartyVisitor implements PartyVisitor {
    @Override
    public void visit(Keys keys) {
        System.out.println("I've got " + keys.getKeyCount() + " keysh. HIC!");
    }

    @Override
    public void visit(Phone phone) {
        System.out.print("At leasht I didn't looshe my phone.");
    }

    @Override
    public void visit(Wallet wallet) {
        System.out.println("At leasht I didn't looshe my wallet.");
    }
}
