package frc.robot.Subsystems.Flywheel;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.Constants;

public class FlywheelIOHardware implements FlywheelIO{

    private final Spark flywheel1 = new Spark(4);
    private final Spark flywheel2 = new Spark(5);

    private void spinMotor(double speed) {
        flywheel1.set(speed);
        flywheel2.set(speed);
    }

    private void stopMotor() {
        flywheel1.stopMotor();
        flywheel2.stopMotor();
    }
}
