package frc.robot.Subsystems.BallControl;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.Constants.IntakeConst;


public class BallControlIOHardware implements BallControlIO{
    private final Spark ballControlMotor = new Spark(IntakeConst.port);
    public void forward (double speed){
        ballControlMotor.set(speed);
    }
    public void stop(){
        ballControlMotor.stopMotor();
    }
}