package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.controlschemes.DriveScheme;
import frc.robot.Subsystems.Drive.Drive;
import frc.robot.Subsystems.Drive.DriveIO;
import frc.robot.Subsystems.Drive.DriveIOHardware;

public class RobotContainer {
    private final Drive drive = new Drive(new DriveIOHardware());

    //Controller CHANGE PORT TO PROPER PORT
    public RobotContainer(){
        DriveScheme.configure(drive,Constants.primaryControllerPort);
    }
}
