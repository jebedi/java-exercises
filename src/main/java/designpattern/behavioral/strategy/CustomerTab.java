package designpattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class CustomerTab {
    private final List<Product> orders;
    private BillingStrategy strategy;

    public CustomerTab() {
        this.orders = new ArrayList<>();
        strategy = BillingStrategy.normalOperations();
    }

    public void order(String name, double price) {
        orders.add(new Product(name, strategy.getPrice(price)));
    }

    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay() {
        orders.forEach(System.out::println);
        System.out.println("Total: "+ orders.stream()
                .mapToDouble(Product::getPrice)
                .sum());
    }
}
