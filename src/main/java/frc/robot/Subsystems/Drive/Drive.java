package frc.robot.Subsystems.Drive;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

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
    public Command forward(double speed){
        return new RunCommand(()->{io.forward(speed);}, this);
    }
    public Command turn(double speed){
        return new RunCommand(()->{io.turn(speed);}, this);
    }
}
