package designpattern.behavioral.visitor.items;

import designpattern.behavioral.visitor.visitor.PartyVisitor;

public class Phone implements NecessaryItem {
    int batteryRemaining;

    public Phone(int batteryRemaining) {
        this.batteryRemaining = batteryRemaining;
    }

    public void usePhone(int drain) {
        this.batteryRemaining -= drain;
    }

    public int getBatteryRemaining() {
        return batteryRemaining;
    }

    @Override
    public void accept(PartyVisitor visitor) {
        visitor.visit(this);
    }
}
