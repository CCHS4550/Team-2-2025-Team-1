package frc.robot.Subsystems.BallControl;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConst;

public class BallControl extends SubsystemBase{
    private final BallControlIO io;
    public BallControl(BallControlIO io) {
        this.io = io;
    }
    public void stop(){
        io.stop();
    }
    public Command forward(){
        return new RunCommand(()->{io.forward(IntakeConst.speed);},this);
    }
}
