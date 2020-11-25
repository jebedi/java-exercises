package designpattern.behavioral.command.electronics;

public class AirConditioner implements Electronics {
    private final String location;

    public AirConditioner(String location) {
        this.location = location;
    }

    @Override
    public void on() {
        System.out.println("AC " + location + "are on");
    }

    @Override
    public void off() {
        System.out.println("AC " + location + "are off");
    }
}
