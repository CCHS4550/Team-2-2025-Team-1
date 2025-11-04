package frc.robot.Subsystems;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class IntakeIOHardware implements IntakeIO{
    private final Spark intakeMotor = new Spark(7);
    public void forward (double speedIntake){
        intakeMotor.set(0.7)
    }
    public void stop(){
        intakeMotor.stopMotor();
    }
}