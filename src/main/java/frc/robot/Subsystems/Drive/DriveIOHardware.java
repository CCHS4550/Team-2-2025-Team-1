package frc.robot.Subsystems.Drive;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.Constants;
import frc.robot.Constants.driveConst;

public class DriveIOHardware implements DriveIO{
    private final Spark LFMotor = new Spark(driveConst.LFID);
    private final Spark LBMotor = new Spark(driveConst.LBID);
    private final Spark RFMotor = new Spark(driveConst.RFID);
    private final Spark RBMotor = new Spark(driveConst.RBID);

    private DifferentialDrive drive = new DifferentialDrive(
        (double output) -> {
            LFMotor.set(output);
            LBMotor.set(output);
        },
        (double output) -> {
            RFMotor.set(output);
            RBMotor.set(output);
        }
    );

    public void arcade(double fStick, double tStick){
        double speed = Constants.driveConst.driveSpeed == Constants.driveConst.SPEEDMODE.HIGH ? fStick*Constants.driveConst.speedH : fStick*Constants.driveConst.speedL;
        double turn = Constants.driveConst.driveSpeed == Constants.driveConst.SPEEDMODE.HIGH ? tStick*Constants.driveConst.turnH : tStick*Constants.driveConst.turnL;

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
