package frc.robot.Subsystems.BallControl;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import frc.robot.Constants.IntakeConst;


public class BallControlIOHardware implements BallControlIO{
    private final SparkMax ballControlMotor = new SparkMax(IntakeConst.port,SparkLowLevel.MotorType.kBrushless);
    public void forward (double speed){
        ballControlMotor.set(speed);
    }
    public void stop(){
        ballControlMotor.stopMotor();
    }
}