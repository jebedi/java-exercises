package designpattern.behavioral.memento;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        ComplexObject complexObject = new ComplexObject("", new ArrayList<>(), new HashMap<>());

        complexObject.addComponent(new Object());
        complexObject.addComponent(new Object());
        complexObject.addComponent(new Object());
        complexObject.addComponent(new Object());

        complexObject.calculateSomething(new Object());
        complexObject.calculateSomething(new Object());
        complexObject.calculateSomething(new Object());
        complexObject.calculateSomething(new Object());

        complexObject.print();
        ComplexObject.Memento save = complexObject.save();

        complexObject.addComponent(new Object());
        complexObject.addComponent(new Object());
        complexObject.addComponent(new Object());
        complexObject.addComponent(new Object());

        complexObject.calculateSomething(new Object());
        complexObject.calculateSomething(new Object());
        complexObject.calculateSomething(new Object());
        complexObject.calculateSomething(new Object());

        complexObject.print();
        complexObject.load(save);
        complexObject.print();

    }
}
