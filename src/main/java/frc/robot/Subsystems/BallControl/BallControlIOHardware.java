package frc.robot.Subsystems.BallControl;

import com.revrobotics.spark.SparkLowLevel;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import frc.robot.Constants.IntakeConst;


public class BallControlIOHardware implements BallControlIO{
    private final SparkMaxConfig ballControlConfig = new SparkMaxConfig();
    private final SparkMax ballControlMotor = new SparkMax(IntakeConst.port, SparkLowLevel.MotorType.kBrushless);

    public BallControlIOHardware(int i){
         ballControlConfig.idleMode(IdleMode.kBrake);
         ballControlConfig.voltageCompensation(12);
         ballControlConfig.smartCurrentLimit(20);
         ballControlConfig.inverted(true);
         ballControlMotor.configure(ballControlConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }

    @Override
    public void setSpeed (double speed){
        ballControlMotor.set(speed);
    }
    @Override
    public void stop(){
        ballControlMotor.setVoltage(0.0);
    }
}