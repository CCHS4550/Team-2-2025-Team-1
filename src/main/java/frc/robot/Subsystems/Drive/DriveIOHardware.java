package frc.robot.Subsystems.Drive;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import frc.robot.Constants;
import frc.robot.Constants.SPEEDMODE;
import frc.robot.Constants.driveConst;

public class DriveIOHardware implements DriveIO{
    private final SparkMax LFMotor = new SparkMax(driveConst.LFID);
    private final SparkMax LBMotor = new SparkMax(driveConst.LBID);
    private final SparkMax RFMotor = new SparkMax(driveConst.RFID);
    private final SparkMax RBMotor = new SparkMax(driveConst.RBID);

    LFMotor.addFollower(LBMotor);
    RFMotor.addFollower(RBMotor);

    private DifferentialDrive drive = new DifferentialDrive(LFMotor,RFMotor);

    public void arcade(double fStick, double tStick){
        double speed = Constants.driveConst.driveSpeed == SPEEDMODE.HIGH ? fStick*Constants.driveConst.speedH : fStick*Constants.driveConst.speedL;
        double turn = Constants.driveConst.driveSpeed == SPEEDMODE.HIGH ? tStick*Constants.driveConst.turnH : tStick*Constants.driveConst.turnL;

        drive.arcadeDrive(speed, turn);
    }
    public void forward (double speed){
        drive.arcadeDrive(speed, 0);
    }
    public void turn (double speed){
        drive.arcadeDrive(0, speed);
    }
    public void stop(){
        drive.stopMotor();
    }
}
