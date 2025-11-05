package frc.robot.Subsystems.Drive;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.commands.ArcadeDrive;

public class Drive extends SubsystemBase{
    private final DriveIO io;
    public Drive(DriveIO io) {
        this.io = io;
    }
    public void arcade(double forward, double right) {
        io.arcade(forward, right);
    }
    public void stop(){
        io.stop();
    }
    public void forward(double speed){
        io.forward(speed);
    }
    public void turn(double speed){
        io.turn(speed);
    }
}
