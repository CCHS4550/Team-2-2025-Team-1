package frc.robot.Subsystems.Drive;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import frc.robot.Constants;
import frc.robot.Constants.SPEEDMODE;
import frc.robot.Constants.driveConst;

public class DriveIOHardware implements DriveIO{
    private final PWMSparkMax LFMotor = new PWMSparkMax(driveConst.LFID);
    private final PWMSparkMax LBMotor = new PWMSparkMax(driveConst.LBID);
    private final PWMSparkMax RFMotor = new PWMSparkMax(driveConst.RFID);
    private final PWMSparkMax RBMotor = new PWMSparkMax(driveConst.RBID);

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
