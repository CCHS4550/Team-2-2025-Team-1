package frc.robot.Subsystems.BallControl;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import frc.robot.Constants.IntakeConst;


public class BallControlIOHardware implements BallControlIO{
    private final PWMSparkMax ballControlMotor = new PWMSparkMax(IntakeConst.port);
    public void forward (double speed){
        ballControlMotor.set(speed);
    }
    public void stop(){
        ballControlMotor.stopMotor();
    }
}