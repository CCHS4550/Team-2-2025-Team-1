package frc.robot.Subsystems.BallControl;
import edu.wpi.first.wpilibj.motorcontrol.Spark;


public class BallControlIOHardware implements BallControlIO{
    private final Spark ballControlMotor = new Spark(7);
    public void forward (double speed){
        ballControlMotor.set(speed);
    }
    public void stop(){
        ballControlMotor.stopMotor();
    }
}