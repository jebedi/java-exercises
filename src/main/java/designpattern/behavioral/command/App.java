package designpattern.behavioral.command;

import designpattern.behavioral.command.command.Command;
import designpattern.behavioral.command.command.ComplexCommand;
import designpattern.behavioral.command.command.OffCommand;
import designpattern.behavioral.command.command.OnCommand;
import designpattern.behavioral.command.electronics.AirConditioner;
import designpattern.behavioral.command.electronics.Electronics;
import designpattern.behavioral.command.electronics.Lights;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Electronics upstairsLights = new Lights("upstairs");
        Electronics downstairsLights = new Lights("downstairs");
        Electronics upstairsAC = new AirConditioner("upstairs");
        Electronics downstairsAC = new AirConditioner("downstairs");

        Command turnOff = new OffCommand(List.of(upstairsAC, upstairsLights, downstairsAC, downstairsLights));
        Command turnOn = new OnCommand(List.of(upstairsAC, upstairsLights));

        Command complex = new ComplexCommand(List.of(turnOff, turnOn));

        complex.execute();
    }
}
