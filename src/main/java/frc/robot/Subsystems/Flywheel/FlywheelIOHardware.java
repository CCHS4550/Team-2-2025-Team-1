package frc.robot.Subsystems.Flywheel;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.Constants.flywheelConst;

public class FlywheelIOHardware implements FlywheelIO {

    private final Spark flywheel1 =
            new Spark(flywheelConst.port1);
    private final Spark flywheel2 =
            new Spark(flywheelConst.port2);

    public void spinMotor(double speed) {
        flywheel1.set(speed);
        flywheel2.set(speed);
    }

    public void stopMotor() {
        flywheel1.stopMotor();
        flywheel2.stopMotor();
    }
}
