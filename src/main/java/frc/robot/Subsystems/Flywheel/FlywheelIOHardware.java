package frc.robot.Subsystems.Flywheel;

import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import frc.robot.Constants.flywheelConst;

public class FlywheelIOHardware implements FlywheelIO {

    private final SparkMax flywheel1 =
            new SparkMax(flywheelConst.port1,SparkLowLevel.MotorType.kBrushless);
    private final SparkMax flywheel2 =
            new SparkMax(flywheelConst.port2,SparkLowLevel.MotorType.kBrushless);

    public void spinMotor(double speed) {
        flywheel1.set(speed);
        flywheel2.set(-speed);
    }

    public void stopMotor() {
        flywheel1.setVoltage(0.0);
        flywheel2.setVoltage(0.0);
    }
}
