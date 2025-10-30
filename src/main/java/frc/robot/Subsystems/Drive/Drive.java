package frc.robot.Subsystems.Drive;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.Constants;

public class Drive extends SubsystemBase{
    private final DriveIO io;
    private final CommandXboxController controller;
    public Drive(DriveIO io, CommandXboxController controller) {
        this.io = io;
        this.controller = controller;
    }
    @Override
    public void periodic(){
        switch(Constants.robotState){
            case Constants.state.TELEOP:
                io.arcade(controller.getLeftY(), controller.getRightX());
                break;
            case Constants.state.AUTO:
                io.auto(Timer.getFPGATimestamp());
                break;
        }
    }
}
