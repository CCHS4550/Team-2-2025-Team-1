package frc.robot.Subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.Constants;

public class Intake extends SubsystemBase{
    private final IntakeIO io;
    public Intake(IntakeIO io) {
        this.io = io;
    }
    @Override
    public void stop(){
        io.stop();
    }
    public void forward(double speedIntake){
        io.forward(speedIntake);
    }
}
