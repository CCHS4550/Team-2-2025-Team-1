package frc.robot.Subsystems.Flywheel;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import frc.robot.Constants.flywheelConst;

public class FlywheelIOHardware implements FlywheelIO{

    private final SparkMax flywheel1 = new SparkMax(flywheelConst.port1,SparkLowLevel.MotorType.kBrushless);
    private final SparkMax flywheel2 = new SparkMax(flywheelConst.port2,SparkLowLevel.MotorType.kBrushless);

    public void spinMotor(double speed) {
        flywheel1.set(speed);
        flywheel2.set(speed);
    }

    public void stopMotor() {
        flywheel1.stopMotor();
        flywheel2.stopMotor();
    }
}
