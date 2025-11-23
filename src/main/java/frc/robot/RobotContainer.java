package frc.robot;

import frc.controlschemes.DriveScheme;
import frc.robot.Subsystems.Drive.Drive;
import frc.robot.Subsystems.Drive.DriveIOHardware;
import frc.robot.Subsystems.BallControl.BallControl;
import frc.robot.Subsystems.BallControl.BallControlIOHardware;
import frc.robot.Subsystems.Flywheel.Flywheel;
import frc.robot.Subsystems.Flywheel.FlywheelIOHardware;
import edu.wpi.first.wpilibj.RobotState;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.controlschemes.BallScheme;

public class RobotContainer {
    private final Drive drive = new Drive(new DriveIOHardware());
    private final Flywheel flywheel = new Flywheel(new FlywheelIOHardware());
    private final BallControl ballControl = new BallControl(new BallControlIOHardware(0));

    public RobotContainer(){
        DriveScheme.configure(drive,Constants.primaryControllerPort);
        BallScheme.configure(ballControl,flywheel,Constants.primaryControllerPort);
    }
    public Command auto(){
        return drive.forward(-0.2).withTimeout(1).andThen(
            drive.turn(0.3).withTimeout(1)).andThen(
            new ParallelCommandGroup(
            flywheel.spinMotor().withTimeout(6),
            ballControl.forward().withTimeout(6)
            ));
    }
}
