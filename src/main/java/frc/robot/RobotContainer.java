package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Subsystems.Drive.Drive;
import frc.robot.Subsystems.Drive.DriveIO;
import frc.robot.Subsystems.Drive.DriveIOHardware;

public class RobotContainer {
    public final Drive drive;

    //Controller CHANGE PORT TO PROPER PORT
    private CommandXboxController primaryController = new CommandXboxController(0);

    public RobotContainer(){
        switch(Constants.robotState){
            case Constants.state.TELEOP:
                drive = new Drive(new DriveIOHardware(), primaryController);
                break;
            case Constants.state.AUTO:
                drive = new Drive(new DriveIOHardware(), primaryController);
                break;
            default:
                drive = new Drive(new DriveIO() {}, primaryController);
        }

    }
}
