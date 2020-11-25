package designpattern.behavioral.state.state;

public class YellowLightState implements SignalLightState {
    private final SignalColor color;

    public YellowLightState() {
        color = SignalColor.YELLOW;
    }

    @Override
    public SignalColor getColor() {
        return color;
    }

    @Override
    public void canVehiclesGo(StateContext context) {
        if (context.getPreviousState().getColor().equals(SignalColor.RED)) {
            System.out.println("Yellow: Get ready!");
            context.setState(SignalColor.GREEN);
        } else {
            System.out.println("Yellow: slow down!");
            context.setState(SignalColor.RED);
        }


    }
}
