package designpattern.behavioral.visitor.items;

import designpattern.behavioral.visitor.visitor.PartyVisitor;

public class Wallet implements NecessaryItem {
    private double money;

    public Wallet(double money) {
        this.money = money;
    }

    public void spendMoney(double howMuch) {
        this.money -= howMuch;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public void accept(PartyVisitor visitor) {
        visitor.visit(this);
    }
}
