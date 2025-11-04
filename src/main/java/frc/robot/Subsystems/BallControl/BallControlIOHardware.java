package frc.robot.Subsystems.BallControl;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.Constants.IntakeConst;

public class BallControlIOHardware implements BallControlIO{
    private final Spark ballControlMotor = new Spark(7);
    public void forward (double speedIntake){
        ballControlMotor.set(IntakeConst.speed);
    }
    public void stop(){
        ballControlMotor.stopMotor();
    }
}