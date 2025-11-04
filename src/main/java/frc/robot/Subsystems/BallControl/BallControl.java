package frc.robot.Subsystems.BallControl;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BallControl extends SubsystemBase{
    private final BallControlIO io;
    public BallControl(BallControlIO io) {
        this.io = io;
    }
    public void stop(){
        io.stop();
    }
    public void forward(double speedIntake){
        io.forward(speedIntake);
    }
}
