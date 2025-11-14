package frc.robot.Subsystems.Flywheel;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import frc.robot.Constants.flywheelConst;

public class FlywheelIOHardware implements FlywheelIO{

    private final PWMSparkMax flywheel1 = new PWMSparkMax(flywheelConst.port1);
    private final PWMSparkMax flywheel2 = new PWMSparkMax(flywheelConst.port2);

    public void spinMotor(double speed) {
        flywheel1.set(speed);
        flywheel2.set(speed);
    }

    public void stopMotor() {
        flywheel1.stopMotor();
        flywheel2.stopMotor();
    }
}
