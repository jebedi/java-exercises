package designpattern.behavioral.state;

import designpattern.behavioral.state.state.StateContext;

public class App {
    public static void main(String[] args) {
        StateContext context = new StateContext();

        context.canVehiclesGo();
        context.canVehiclesGo();
        context.canVehiclesGo();
        context.canVehiclesGo();
        context.canVehiclesGo();
        context.canVehiclesGo();
        context.canVehiclesGo();
        context.canVehiclesGo();
        context.canVehiclesGo();
        context.canVehiclesGo();
    }
}
