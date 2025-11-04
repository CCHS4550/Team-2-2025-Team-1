package frc.robot;

import java.util.function.BooleanSupplier;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class OI {
    private CommandXboxController primaryController = new CommandXboxController(Constants.MainPrimaryPort);
    public double getAxis(String axis){
        switch(axis){
            case "LX":
                return primaryController.getLeftX();
            case "LY":
                return primaryController.getLeftY();
            case "RX":
                return primaryController.getRightX();
            case "RY":
                return primaryController.getRightY();
            default:
                return 0.0;
        }
    }
    public Trigger getButton(String id){
        switch(id){
            case "a":
                return primaryController.a();
            case "b":
                return primaryController.b();
            case "x":
                return primaryController.x();
            case "y":
                return primaryController.y();
            default:
                BooleanSupplier bool = () -> {return false;};
                return new Trigger(bool);
        }
    }
}
