package frc.controlschemes;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Subsystems.BallControl.BallControl;
import frc.robot.Subsystems.Flywheel.Flywheel;

public class BallScheme {
    private static CommandXboxController controller;
    public static void configure(BallControl ballControl, Flywheel flywheel, int port){
        controller = new CommandXboxController(port);
        configureBalls(ballControl,flywheel);
    }
    private static void configureBalls(BallControl ballControl, Flywheel flywheel){
        controller.rightBumper().onTrue(ballControl.forward());
        controller.rightBumper().onFalse(ballControl.stop());
        controller.start().onTrue(flywheel.spinMotor());
    }
}