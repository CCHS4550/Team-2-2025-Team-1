package frc.robot.Subsystems.Drive;

import org.littletonrobotics.junction.AutoLog;
import frc.robot.Constants;

public interface DriveIO {
    @AutoLog
    public class DriveIOInputs{

    }
    public default void arcade (double fStick, double tStick){}
    public default void auto (double time){}
}
