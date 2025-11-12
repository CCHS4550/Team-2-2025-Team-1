package frc.robot.Subsystems.Flywheel;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.Constants.flywheelConst;

public class Flywheel extends SubsystemBase{
    private FlywheelIO io;
    public Flywheel(FlywheelIO flywheel) {
        io = flywheel;
    }
    public Command spinMotor() {
        return new RunCommand(()->{io.spinMotor(flywheelConst.speed);},this);
    }
    public void stopMotor() {
        io.stop();
    }
}