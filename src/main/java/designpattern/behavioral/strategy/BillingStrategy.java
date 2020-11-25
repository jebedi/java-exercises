package designpattern.behavioral.strategy;

public interface BillingStrategy {
    double getPrice(double rawPrice);

    static BillingStrategy normalOperations() {
        return rawPrice -> rawPrice;
    }

    static BillingStrategy happyHours() {
        return rawPrice -> rawPrice * 0.8;
    }
}
