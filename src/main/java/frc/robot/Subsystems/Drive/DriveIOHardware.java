package frc.robot.Subsystems.Drive;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.Constants;

public class DriveIOHardware implements DriveIO{
    private final Spark leftMotor1;
    private final Spark leftMotor2;
    private final Spark rightMotor1;
    private final Spark rightMotor2;

    public DriveIOHardware (int[] channels){
        leftMotor1 = new Spark(channels[0]);
        leftMotor2 = new Spark(channels[1]);
        rightMotor1 = new Spark(channels[2]);
        rightMotor2 = new Spark(channels[3]);        
    }

    private final DifferentialDrive drive1 = new DifferentialDrive(leftMotor1,rightMotor1);
    private final DifferentialDrive drive2 = new DifferentialDrive(leftMotor2,rightMotor2);

    public void arcade(double fStick, double tStick){
        double speed = Constants.driveConst.driveSpeed == Constants.driveConst.SPEEDMODE.HIGH ? fStick*Constants.driveConst.speedH : fStick*Constants.driveConst.speedL;
        double turn = Constants.driveConst.driveSpeed == Constants.driveConst.SPEEDMODE.HIGH ? tStick*Constants.driveConst.turnH : tStick*Constants.driveConst.turnL;

        drive1.arcadeDrive(speed, turn);
        drive2.arcadeDrive(speed, turn);
    }
    public void auto(double time){
        if(time - Constants.autoStartTime <= 2){
            drive1.arcadeDrive(0.6, 0);
            drive2.arcadeDrive(0.6, 0);
        } else {
            drive1.stopMotor();
            drive2.stopMotor();
        }
    }
}
