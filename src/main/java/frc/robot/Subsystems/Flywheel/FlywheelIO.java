package frc.robot.Subsystems.Flywheel;
public interface FlywheelIO {
    public class FlywheelIOInputs{
        public enum WheelSpeed {
            FAST,SLOW
        }
        public WheelSpeed speed;
    }
    public default void launch (boolean active) {}
}
