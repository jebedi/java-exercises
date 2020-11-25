package designpattern.behavioral.visitor.items;

import designpattern.behavioral.visitor.visitor.PartyVisitor;

public class Keys implements NecessaryItem {
    int keyCount;

    public Keys(int keyCount) {
        this.keyCount = keyCount;
    }

    public int getKeyCount() {
        return keyCount;
    }

    @Override
    public void accept(PartyVisitor visitor) {
        visitor.visit(this);
    }
}
