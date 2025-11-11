package frc.robot.Subsystems.Flywheel;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Flywheel extends SubsystemBase{
    private FlywheelIO io;
    public Flywheel(FlywheelIO flywheel) {
        io = flywheel;
    }
    public void spinMotor(double speed) {
        io.spinMotor(speed);
    }
    public void stopMotor() {
        io.stop();
    }
}