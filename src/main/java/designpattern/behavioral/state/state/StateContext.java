package designpattern.behavioral.state.state;

import java.util.Map;

import static designpattern.behavioral.state.state.SignalLightState.SignalColor.*;

public class StateContext {
    private SignalLightState currentState;
    private SignalLightState previousState;
    private final Map<SignalLightState.SignalColor, SignalLightState> signalStates;

    public StateContext() {
        RedLightState redLightState = new RedLightState();
        YellowLightState yellowLightState = new YellowLightState();
        GreenLightState greenLightState = new GreenLightState();

        signalStates = Map.of(
                RED, redLightState,
                YELLOW, yellowLightState,
                GREEN, greenLightState);
        currentState = redLightState;
        previousState = yellowLightState;
    }

    public void setState(SignalLightState.SignalColor color) {
        previousState = currentState;
        currentState = signalStates.get(color);
    }

    public SignalLightState getCurrentState() {
        return currentState;
    }

    public SignalLightState getPreviousState() {
        return previousState;
    }

    public void canVehiclesGo() {
        currentState.canVehiclesGo(this);
    }
}
