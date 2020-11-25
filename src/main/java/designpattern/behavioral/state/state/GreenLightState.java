package designpattern.behavioral.state.state;

public class GreenLightState implements SignalLightState {
    private final SignalColor color;

    public GreenLightState() {
        color = SignalColor.GREEN;
    }

    @Override
    public SignalColor getColor() {
        return color;
    }

    @Override
    public void canVehiclesGo(StateContext context) {
        System.out.println("Green: Go!");
        context.setState(SignalColor.YELLOW);
    }
}
