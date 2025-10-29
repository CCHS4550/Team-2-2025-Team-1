package frc.robot.Subsystems.Flywheel;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.Constants;

public class FlywheelIOHardware implements FlywheelIO{
    private FlywheelIOInputs io;

    private final Spark flywheel1 = new Spark(4);
    private final Spark flywheel2 = new Spark(5);

    public void launch(boolean active){
        if(!active){
            flywheel1.set(0);
            flywheel2.set(0);
            return;
        }
        if(io.speed == io.WheelSpeed.FAST){
            flywheel1.set(Constants.flywheelConst.speedF);
            flywheel2.set(Constants.flywheelConst.speedF);
        }
        if(io.speed == io.WheelSpeed.SLOW){
            flywheel1.set(Constants.flywheelConst.speedS);
            flywheel2.set(Constants.flywheelConst.speedS);
        }
    }
}
