package frc.robot;

import frc.controlschemes.DriveScheme;
import frc.robot.Subsystems.Drive.Drive;
import frc.robot.Subsystems.Drive.DriveIOHardware;
import frc.robot.Subsystems.BallControl.BallControl;
import frc.robot.Subsystems.BallControl.BallControlIOHardware;
import frc.robot.Subsystems.Flywheel.Flywheel;
import frc.robot.Subsystems.Flywheel.FlywheelIOHardware;
import frc.controlschemes.BallScheme;

public class RobotContainer {
    private final Drive drive = new Drive(new DriveIOHardware());
    private final Flywheel flywheel = new Flywheel(new FlywheelIOHardware());
    private final BallControl ballControl = new BallControl(new BallControlIOHardware());

    //Controller CHANGE PORT TO PROPER PORT
    public RobotContainer(){
        DriveScheme.configure(drive,Constants.primaryControllerPort);
        BallScheme.configure(ballControl,flywheel,Constants.primaryControllerPort);
    }
    public void periodic(){
        BallScheme.configureBalls();
    }
}
