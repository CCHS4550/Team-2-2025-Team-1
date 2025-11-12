package frc.robot;

public class Constants {
    public static final int primaryControllerPort = 0;
    public static double autoStartTime = 0.0;
    public enum state {
        TELEOP,
        AUTO,
        SIM,
        DISABLE
    }
    public enum SPEEDMODE {
        HIGH,
        LOW
    }
    public static state robotState = state.DISABLE;
    public static class driveConst{

        public static int LFID = 0;
        public static int LBID = 1;
        public static int RFID = 2;
        public static int RBID = 3;

        public static double speedH = 0.6;
        public static double speedL = 0.3;
        public static double turnH = 0.3;
        public static double turnL = 0.1;
        
        public static SPEEDMODE driveSpeed = SPEEDMODE.HIGH;
    }
    public static class flywheelConst{
        public static final int port2 = 0;
        public static final int port1 = 0;

        public static double speed = 0.8; 
    }
    public static class IntakeConst{
        public static int port = 6;

        public static double speed = 0.5;
    }
}
