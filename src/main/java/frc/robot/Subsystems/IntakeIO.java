package frc.robot.Subsystems;

import org.littletonrobotics.junction.AutoLog;
import frc.robot.Constants;

public interface IntakeIO {
    public default void forward (double speed){}
    public default void stop(){}
}