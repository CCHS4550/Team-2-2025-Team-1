package frc.robot;

public class Constants {
    public static double autoStartTime = 0.0;
    public enum state {
        TELEOP,
        AUTO,
        SIM
    }
    public static state robotState = state.REAL;
    public static class driveConst{
        public static double speedH = 0.6;
        public static double speedL = 0.3;
        public static double turnH = 0.3;
        public static double turnL = 0.1;
        public enum SPEEDMODE {
            HIGH,
            LOW
        }
        public static SPEEDMODE driveSpeed = SPEEDMODE.HIGH;
    }
    public static class flywheelConst{

    }
    public static class intakeConst{

    }
}
