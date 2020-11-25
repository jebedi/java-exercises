package designpattern.behavioral.visitor.visitor;

import designpattern.behavioral.visitor.items.Keys;
import designpattern.behavioral.visitor.items.Phone;
import designpattern.behavioral.visitor.items.Wallet;

public class BeforePartyVisitor implements PartyVisitor {
    @Override
    public void visit(Keys keys) {
        System.out.println("I've got " + keys.getKeyCount() + " keys. All accounted for.");
    }

    @Override
    public void visit(Phone phone) {
        int batteryRemaining = phone.getBatteryRemaining();
        System.out.print("Got " + batteryRemaining + "% battery left.");

        if (batteryRemaining >= 50) {
            System.out.println("Should be enough.");
        } else {
            System.out.println("Should charge up my phone.");
        }

        phone.usePhone(45);
    }

    @Override
    public void visit(Wallet wallet) {
        double money = wallet.getMoney();
        System.out.print("Got " + money + "PLN on me.");

        if (money >= 200.0) {
            System.out.println("Should be enough.");
        } else {
            System.out.println("Need to stop by the ATM.");
        }

        wallet.spendMoney(150.0);
    }
}
