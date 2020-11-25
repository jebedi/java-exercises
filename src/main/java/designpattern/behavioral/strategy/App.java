package designpattern.behavioral.strategy;

public class App {
    public static void main(String[] args) {
        CustomerTab customer1 = new CustomerTab();

        customer1.order("Shipyard Ale", 10);
        customer1.order("Shipyard Ale", 10);
        customer1.order("Shipyard Ale", 10);
        customer1.order("Shipyard Ale", 10);

        customer1.pay();

        CustomerTab customer2 = new CustomerTab();

        customer2.order("Shipyard Ale", 10);
        customer2.order("Shipyard Ale", 10);
        customer2.setStrategy(BillingStrategy.happyHours());
        customer2.order("Shipyard Ale", 10);
        customer2.order("Shipyard Ale", 10);

        customer2.pay();


    }
}
