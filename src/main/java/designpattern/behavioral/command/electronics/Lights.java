package designpattern.behavioral.command.electronics;

public class Lights implements Electronics {
    private final String location;

    public Lights(String location) {
        this.location = location;
    }

    @Override
    public void on() {
        System.out.println("Lights " + location + "are on");
    }

    @Override
    public void off() {
        System.out.println("Lights " + location + "are off");
    }
}
