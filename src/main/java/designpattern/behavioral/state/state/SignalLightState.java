package designpattern.behavioral.state.state;

public interface SignalLightState {
    enum SignalColor {
        RED, YELLOW, GREEN
    }

    SignalColor getColor();

    void canVehiclesGo(StateContext context);
}
