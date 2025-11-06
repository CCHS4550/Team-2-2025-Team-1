package frc.robot.Subsystems.Drive;


public interface DriveIO {
    public default void arcade (double fStick, double tStick){}
    public default void forward (double speed){}
    public default void turn (double speed){}
    public default void stop(){}
}
