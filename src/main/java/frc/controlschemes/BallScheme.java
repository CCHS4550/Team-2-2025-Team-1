package frc.controlschemes;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Subsystems.BallControl.BallControl;
import frc.robot.Subsystems.Flywheel.Flywheel;

public class BallScheme {
    private static CommandXboxController controller;
    private static BallControl ballControl;
    private static Flywheel flywheel;
    public static void configure(BallControl ballControl, Flywheel flywheel, int port){
        controller = new CommandXboxController(port);
        this.ballControl = ballControl;
        this.flywheel = flywheel;
        //configureBalls(ballControl,flywheel);
    }
    private static void configureBalls(){
        controller.rightBumper().whileTrue(ballControl.forward());
        controller.start().onTrue(flywheel.spinMotor());
    }
}