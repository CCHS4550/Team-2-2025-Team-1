package frc.robot.Subsystems.Drive;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants;
import frc.robot.Constants.SPEEDMODE;
import frc.robot.Constants.driveConst;
import com.revrobotics.spark.SparkLowLevel;
import com.revrobotics.spark.SparkMax;

public class DriveIOHardware implements DriveIO{
    private final SparkMax LFMotor = new SparkMax(driveConst.LFID, SparkLowLevel.MotorType.kBrushless);
    private final SparkMax LBMotor = new SparkMax(driveConst.LBID, SparkLowLevel.MotorType.kBrushless);
    private final SparkMax RFMotor = new SparkMax(driveConst.RFID, SparkLowLevel.MotorType.kBrushless);
    private final SparkMax RBMotor = new SparkMax(driveConst.RBID, SparkLowLevel.MotorType.kBrushless);

    private DifferentialDrive drive = new DifferentialDrive(
        (output)->{
            LFMotor.set(-output);
            LBMotor.set(-output);
        },
        (output)->{
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
