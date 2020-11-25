package designpattern.behavioral.state.state;

public class RedLightState implements SignalLightState {
    private final SignalColor color;

    public RedLightState() {
        color = SignalColor.RED;
    }

    @Override
    public SignalColor getColor() {
        return color;
    }

    @Override
    public void canVehiclesGo(StateContext context) {
        System.out.println("RED: No!");
        context.setState(SignalColor.YELLOW);
    }
}
