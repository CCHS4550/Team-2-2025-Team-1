package frc.robot.Subsystems.Drive;

import org.littletonrobotics.junction.AutoLog;
import frc.robot.Constants;

public interface DriveIO {
    public default void arcade (double fStick, double tStick){}
    public default void forward (double speed){}
    public default void turn (double speed){}
    public default void stop(){}
}
