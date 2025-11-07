import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Subsystems.Flywheel.FlywheelIO;

public class Flywheel extends SubsystemBase{
    private FlywheelIO io;
    public Flywheel(FlywheelIO flywheel) {
        io = flywheel;
    }
    public void spinMotor(double speed) {}
    public void stopMotor() {}
}