package frc.robot.Subsystems.Drive;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.commands.ArcadeDrive;

public class Drive extends SubsystemBase{
    private final DriveIO io;
    public Drive(DriveIO io) {
        this.io = io;
    }
    @Override
    public void initDefaultCommand(){
        setDefaultCommand(new ArcadeDrive());
    }
    public void arcade(double speed, double turn){
        io.arcade(speed, turn);
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
